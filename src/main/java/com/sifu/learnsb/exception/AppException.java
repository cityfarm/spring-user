package com.sifu.learnsb.exception;

public class AppException extends RuntimeException {

    public AppException(ErrorCode e) {
        super(e.getMessage());
        this.errorCode = e;
    }

    private ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
