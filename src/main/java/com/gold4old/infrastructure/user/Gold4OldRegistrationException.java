package com.gold4old.infrastructure.user;

/**
 * Created by virmanv on 26/09/2016 October.
 */
public class Gold4OldRegistrationException extends RuntimeException  {
    public Gold4OldRegistrationException() {
        super();
    }

    public Gold4OldRegistrationException(String message) {
        super(message);
    }

    public Gold4OldRegistrationException(String message, Throwable cause) {
        super(message, cause);
    }

    public Gold4OldRegistrationException(Throwable cause) {
        super(cause);
    }

    protected Gold4OldRegistrationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
