package com.sifu.learnsb.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999,"Uncategorized error"),
    USER_EXISTED(1002, "User existed"),
    INVALID_KEY(1001, "Invalid key"),
    USERNAME_INVALID(1003,"USERNAME_INVALID"),
    PASSWORD_INVALID(1004,"PASSWORD_INVALID"),
    USER_NOT_EXISTED(1005,"User not existed" ),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
