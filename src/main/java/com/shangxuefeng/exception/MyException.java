package com.shangxuefeng.exception;

/**
 * @author shangxuefeng @date 2018/3/29
 */
public class MyException extends RuntimeException{
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
