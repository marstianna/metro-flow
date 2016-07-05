package org.metroflow.core.impl.commandInterceptor;

import org.metroflow.core.BaseCommand;
import org.metroflow.core.bean.Execution;

/**
 * Created by zoupeng on 16/7/5.
 */
public class ContextInterceptor extends AbstractCommandInterceptor{
    @Override
    public <T> T execute(Execution execution, BaseCommand<T> command) {
        return null;
    }
}
