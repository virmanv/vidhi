package com.gold4old.domain.model.user;

/**
 * Created by virmanv on 26/09/2016 October.
 */
public class PasswordMismatchException extends RuntimeException {
    public PasswordMismatchException() {
        super();
    }

    public PasswordMismatchException(String message) {
        super(message);
    }

    public PasswordMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
