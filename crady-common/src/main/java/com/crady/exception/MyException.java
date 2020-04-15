package com.crady.exception;

/**
 * @author :Crady
 * date :2020/04/15 23:08
 * desc :
 **/
public class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
