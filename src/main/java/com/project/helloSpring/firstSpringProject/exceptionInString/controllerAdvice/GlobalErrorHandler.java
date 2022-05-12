package com.project.helloSpring.firstSpringProject.exceptionInString.controllerAdvice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
@RestControllerAdvice
@Slf4j
public class GlobalErrorHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(SdaException1.class)
    public Error1 handleSdaException1(final SdaException1 exception) {
        log.debug("something bad has happened ...");
        return new Error1(exception.getMessage());
    }
}
