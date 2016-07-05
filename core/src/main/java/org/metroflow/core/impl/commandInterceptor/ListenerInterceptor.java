package org.metroflow.core.impl.commandInterceptor;

import org.metroflow.core.BaseCommand;
import org.metroflow.core.ProcessListener;
import org.metroflow.core.bean.Execution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zoupeng on 16/7/5.
 */
public class ListenerInterceptor extends AbstractCommandInterceptor {
    private List<ProcessListener> beforeListener = new ArrayList<>();
    private List<ProcessListener> afterListener = new ArrayList<>();
    @Override
    public <T> T execute(Execution execution, BaseCommand<T> command) {
        for(ProcessListener listener : beforeListener){
            listener.update(execution);
        }
        T result = this.next.execute(execution,command);
        for(ProcessListener listener : afterListener){
            listener.update(execution);
        }
        return result;
    }

    public void addBeforeListener(ProcessListener listener){
        beforeListener.add(listener);
    }

    public void addAfterListener(ProcessListener listener){
        afterListener.add(listener);
    }

    public void removeBeforeListener(ProcessListener listener){
        beforeListener.remove(listener);
    }

    public void removeAfterListener(ProcessListener listener){
        afterListener.remove(listener);
    }
}
