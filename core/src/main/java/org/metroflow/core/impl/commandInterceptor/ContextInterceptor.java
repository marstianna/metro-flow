package org.metroflow.core.impl.commandInterceptor;

import org.apache.commons.lang3.StringUtils;
import org.metroflow.commons.utils.enums.ExecutionStatus;
import org.metroflow.core.BaseCommand;
import org.metroflow.core.bean.Execution;
import org.metroflow.core.context.Context;

import java.util.UUID;

/**
 * Created by zoupeng on 16/7/5.
 */
public class ContextInterceptor extends AbstractCommandInterceptor{
    private static final ThreadLocal<String> EXECUTE_MARK = new ThreadLocal<>();

    @Override
    public <T> T execute(Execution execution, BaseCommand<T> command) {
        T result = null;
        try{
            Context.setExecuteMark(UUID.fromString(execution.getId()).toString());
            result = next.execute(execution,command);
            if(StringUtils.isBlank(Context.getExecuteMark())){
                execution.setStatus(ExecutionStatus.END);
            }
        }finally {
            Context.removeExecuteMark();
        }
        return result;
    }
}
