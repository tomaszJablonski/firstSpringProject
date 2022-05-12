package com.project.helloSpring.firstSpringProject.pathVariable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController implements Message {


    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/api/hello/{id}")
    @Override
    public String message(@PathVariable(name = "id") final Integer id) {
        return ("Hello world" + id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, path = "/api/hello1/{id}")
    public Message1 messageWithIdClass(@PathVariable(name = "id") final Integer id) {
        return new Message1("Hello world " + id);
    }


}


