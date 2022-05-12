package com.project.helloSpring.firstSpringProject.exceptionInString.exceptionHandler;

public class SpecificSdaException extends SdaException {
    public SpecificSdaException(final String message) {
        super(message);
    }
}
