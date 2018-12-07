package com.company.elastic.open.exception;

import com.company.elastic.base.constants.ErrorCode;
import com.company.elastic.base.exception.AbstractBaseException;


public class ServiceBusinessException extends AbstractBaseException {
    private static final long serialVersionUID = -8354044543394782989L;

    private int errorCode;
    private String message;

    @Override
    public Integer getErrorCode() {
        return errorCode;
    }

    @Override
    public String getErrorMessage() {
        return message;
    }

    public ServiceBusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public ServiceBusinessException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
