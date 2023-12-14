package com.example.StudentMangement.exception;

public class NoRecordFoundException extends RuntimeException{
    public NoRecordFoundException(String string) {
        super(string);
    }
}
