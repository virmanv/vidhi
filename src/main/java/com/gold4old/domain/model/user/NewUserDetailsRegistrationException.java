package com.gold4old.domain.model.user;

/**
 * Created by virmanv on 26/09/2016 October.
 */
public class NewUserDetailsRegistrationException extends Exception {
    public NewUserDetailsRegistrationException() {
        super();
    }

    public NewUserDetailsRegistrationException(String message) {
        super(message);
    }

    public NewUserDetailsRegistrationException(String message, Throwable cause) {
        super(message, cause);
    }
}
