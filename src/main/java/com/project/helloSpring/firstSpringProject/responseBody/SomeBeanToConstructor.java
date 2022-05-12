package com.project.helloSpring.firstSpringProject.responseBody;

import com.project.helloSpring.firstSpringProject.value.AnotherBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeBeanToConstructor {

    private final String injectedValue;
    private final AnotherBean anotherBean;

    public SomeBeanToConstructor(final AnotherBean anotherBean,
                                 @Value("${pl.sdacamy.example:default_value}") final String injectedValue) {
        this.anotherBean = anotherBean;
        this.injectedValue = injectedValue;
    }

    public String getInjectedValue() {
        return injectedValue;
    }
}
