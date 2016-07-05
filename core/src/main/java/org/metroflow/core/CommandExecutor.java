package org.metroflow.core;

import org.metroflow.core.bean.Execution;

/**
 * Created by zoupeng on 16/7/5.
 */
public interface CommandExecutor {
    /**
     * 获取默认的执行实例
     * @return
     */
    Execution getDefaultExecution();

    /**
     * 执行command,使用默认的执行实例
     * @param command
     * @param <T>
     * @return
     */
    <T> T execute(BaseCommand<T> command);

    /**
     * 执行command,使用传入的执行实例
     * @param execution
     * @param command
     * @param <T>
     * @return
     */
    <T> T execute(Execution execution, BaseCommand<T> command);
}
