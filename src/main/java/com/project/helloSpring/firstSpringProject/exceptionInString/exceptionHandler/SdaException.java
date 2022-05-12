package com.project.helloSpring.firstSpringProject.exceptionInString.exceptionHandler;

public class SdaException extends RuntimeException {
    public SdaException(final String message) {
        super(message);
    }
}
