package com.project.helloSpring.firstSpringProject.responseBody;


import com.project.helloSpring.firstSpringProject.value.AnotherBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeBeanToField {

    private final AnotherBean anotherBean;
    @Value("${pl.sdacademy.example}")
    private String injectValue;

    public SomeBeanToField(final AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
