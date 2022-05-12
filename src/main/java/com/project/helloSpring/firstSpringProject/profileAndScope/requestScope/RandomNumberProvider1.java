package com.project.helloSpring.firstSpringProject.profileAndScope.requestScope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RandomNumberProvider1 {
    private final int value = new Random().nextInt();

    public int getValue() {

        return value;
    }
}
