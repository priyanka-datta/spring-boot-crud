package com.priyanka.datta.springbootcrud.exception;

public class NoEmployeeFoundException extends RuntimeException{

    public NoEmployeeFoundException() {
        super();
    }

    public NoEmployeeFoundException(String message) {
        super(message);
    }

    public NoEmployeeFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEmployeeFoundException(Throwable cause) {
        super(cause);
    }

    protected NoEmployeeFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
