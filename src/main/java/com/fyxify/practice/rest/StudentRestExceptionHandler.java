package com.fyxify.practice.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException studentCustomException) {
        StudentErrorResponse errorResponse = new StudentErrorResponse();
        errorResponse.setMessage(studentCustomException.getMessage());
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception ex) {
        StudentErrorResponse errorResponse = new StudentErrorResponse();
//        errorResponse.setMessage(ex.getMessage());
        errorResponse.setMessage("Something went wrong");
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setTimestamp(System.currentTimeMillis());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }
}
