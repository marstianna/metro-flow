package org.metroflow.core.impl.commandInterceptor;

import org.metroflow.core.CommandInterceptor;

/**
 * Created by zoupeng on 16/7/5.
 */
public abstract class AbstractCommandInterceptor implements CommandInterceptor{
    protected CommandInterceptor next;

    @Override
    public void setNext(CommandInterceptor _next) {
        this.next = _next;
    }

    @Override
    public CommandInterceptor getNext() {
        return next;
    }
}
