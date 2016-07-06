package org.metroflow.core.exception;

/**
 * Created by zoupeng on 16/7/5.
 */
public class MetroFlowException extends Exception {
    public MetroFlowException() {
        super();
    }

    public MetroFlowException(String message) {
        super(message);
    }

    public MetroFlowException(String message, Throwable cause) {
        super(message, cause);
    }

    public MetroFlowException(Throwable cause) {
        super(cause);
    }

    protected MetroFlowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
