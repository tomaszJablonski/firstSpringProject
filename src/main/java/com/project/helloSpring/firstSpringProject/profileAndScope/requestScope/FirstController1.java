package com.project.helloSpring.firstSpringProject.profileAndScope.requestScope;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FirstController1 {

    private final RandomNumberProvider1 randomNumberProvider1;

    @GetMapping("/api/number1/val-a")
    public Integer showFirstNumber() {

        return randomNumberProvider1.getValue();
    }
}
