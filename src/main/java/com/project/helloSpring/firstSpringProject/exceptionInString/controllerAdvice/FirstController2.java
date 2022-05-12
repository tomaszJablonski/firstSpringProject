package com.project.helloSpring.firstSpringProject.exceptionInString.controllerAdvice;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController2 {

    @GetMapping("/api/resource/advice1")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void willAlwaysThrow() {
        throw new SdaException1("Boom something bad happened in the controller method");
    }
}
