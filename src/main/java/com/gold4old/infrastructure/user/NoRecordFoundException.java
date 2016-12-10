package com.gold4old.infrastructure.user;

/**
 * Created by virmanv on 26/09/2016 October.
 */
public class NoRecordFoundException extends RuntimeException  {

    public NoRecordFoundException() {
        super();
    }

    public NoRecordFoundException(String message) {
        super(message);
    }
}
