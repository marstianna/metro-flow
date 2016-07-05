package org.metroflow.core.config;

import org.metroflow.core.CommandInterceptor;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zoupeng on 16/7/5.
 */
public class CommandInterceptorChainConfig {
    //first should be the TransactionInterceptor
    private CommandInterceptor first;
    //last should be the CommandInvoker
    private CommandInterceptor last;
    private Set<CommandInterceptor> others = new HashSet<>();

    public CommandInterceptor getFirst() {
        return first;
    }

    public void setFirst(CommandInterceptor first) {
        this.first = first;
    }

    public CommandInterceptor getLast() {
        return last;
    }

    public void setLast(CommandInterceptor last) {
        this.last = last;
    }

    public Set<CommandInterceptor> getOthers() {
        return others;
    }

    public void setOthers(Set<CommandInterceptor> others) {
        this.others = others;
    }
}
