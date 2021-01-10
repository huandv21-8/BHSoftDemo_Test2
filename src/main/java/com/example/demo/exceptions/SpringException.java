package com.example.demo.exceptions;

public class SpringException extends RuntimeException{
    public SpringException(String message) { super(message);}
    public SpringException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

}
