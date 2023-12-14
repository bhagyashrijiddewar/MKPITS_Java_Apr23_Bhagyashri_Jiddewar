package com.example.StudentMangement.exception;

import com.example.StudentMangement.errorPage.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlerForRecordNotFoundException {
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> NoRecordFound(NoRecordFoundException noRecordFoundException) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetails.setMessage(noRecordFoundException.getMessage());
        errorDetails.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
