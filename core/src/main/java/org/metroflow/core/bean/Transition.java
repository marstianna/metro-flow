package org.metroflow.core.bean;

/**
 * Created by zoupeng on 16/7/5.
 */
public class Transition {
    private Activity source;
    private Activity destination;

    public Activity getSource() {
        return source;
    }

    public void setSource(Activity source) {
        this.source = source;
    }

    public Activity getDestination() {
        return destination;
    }

    public void setDestination(Activity destination) {
        this.destination = destination;
    }
}
