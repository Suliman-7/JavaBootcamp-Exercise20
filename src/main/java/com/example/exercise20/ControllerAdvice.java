package com.example.exercise20;

import com.example.exercise20.Api.ApiException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity ApiException(ApiException apiException) {
        return ResponseEntity.status(400).body(apiException.getMessage());
    }
}