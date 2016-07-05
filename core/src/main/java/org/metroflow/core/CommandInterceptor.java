package org.metroflow.core;

import org.metroflow.core.bean.Execution;

/**
 * Created by zoupeng on 16/7/5.
 */
public interface CommandInterceptor {
    <T> T execute(Execution execution, BaseCommand<T> command);

    void setNext(CommandInterceptor next);

    CommandInterceptor getNext();
}
