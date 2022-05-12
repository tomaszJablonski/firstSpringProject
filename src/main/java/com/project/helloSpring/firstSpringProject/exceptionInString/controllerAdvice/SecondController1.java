package com.project.helloSpring.firstSpringProject.exceptionInString.controllerAdvice;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController1 {

    @GetMapping("/api/resource/advice2")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void alsoAlwaysThrow() {

        throw new SdaException1("Boom a corner case occurred");
    }
}
