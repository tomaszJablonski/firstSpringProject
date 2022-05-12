package com.project.helloSpring.firstSpringProject.profileAndScope.prototype;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecondController {

    private final RandomNumberProvider randomNumberProvider;

    @GetMapping("/api/number/val-b")
    public Integer showFirstNumber() {
        return randomNumberProvider.getValue();
    }
}
