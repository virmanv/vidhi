package com.gold4old.infrastructure.user;

/**
 * Created by virmanv on 26/09/2016 October.
 */
public class UserNotActiveException extends RuntimeException {
    public UserNotActiveException() {
        super();
    }

    public UserNotActiveException(String message) {
        super(message);
    }

    public UserNotActiveException(String message, Throwable cause) {
        super(message, cause);
    }
}
