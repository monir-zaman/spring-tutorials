package com.learningspring.app.exceptions;

public class StudentNotFoundException extends RuntimeException{
    private final String msg;

    public StudentNotFoundException(String msg) {
        super();
        this.msg = msg;
    }
}
