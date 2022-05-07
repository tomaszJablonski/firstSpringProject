package com.project.helloSpring.firstSpringProject.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        String welcomeText = "welcome in my site";
        return welcomeText;
    }
}
