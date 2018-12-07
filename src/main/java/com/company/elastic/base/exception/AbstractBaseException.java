package com.company.elastic.base.exception;


public abstract class AbstractBaseException extends RuntimeException {

    private static final long serialVersionUID = -9150719013237525228L;

    public AbstractBaseException(String message) {
        super(message);
    }

    public AbstractBaseException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public abstract Integer getErrorCode();

    public abstract String getErrorMessage();

}


