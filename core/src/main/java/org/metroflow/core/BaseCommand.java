package org.metroflow.core;

import org.metroflow.core.bean.Execution;

/**
 * Created by zoupeng on 16/7/5.
 */
public interface BaseCommand<T> {
    T execute(Execution execution);

    Integer getPropagationBehavior();
}
