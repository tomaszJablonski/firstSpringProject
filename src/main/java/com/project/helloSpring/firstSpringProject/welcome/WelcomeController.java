package com.project.helloSpring.firstSpringProject.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "api/welcome")
    public String welcome() {
        String welcomeText = "welcome in my site";
        return welcomeText;
    }

    //TODO try to solve a problem WHY I don`t have a result in page?
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "api/plus")
    public String plus(int a, int b) {
        a = 5;
        b = 10;
        int c = a + b;
        String s = Integer.toString(c);//Now it will return "15"
        return s;
    }

}
