package org.metroflow.core.impl.commandInterceptor;

import org.metroflow.core.BaseCommand;
import org.metroflow.core.CommandInterceptor;
import org.metroflow.core.bean.Execution;

/**
 * Created by zoupeng on 16/7/5.
 */
public class CommandInvoker implements CommandInterceptor {
    @Override
    public <T> T execute(Execution execution, BaseCommand<T> command) {
        return command.execute(execution);
    }

    @Override
    public void setNext(CommandInterceptor next) {
        throw new UnsupportedOperationException("Invoker should be the last one of interceptor chain");
    }

    @Override
    public CommandInterceptor getNext() {
        return null;
    }
}
