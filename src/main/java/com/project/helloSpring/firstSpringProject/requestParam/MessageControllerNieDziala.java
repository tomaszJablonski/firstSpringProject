package com.project.helloSpring.firstSpringProject.requestParam;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class MessageControllerNieDziala {


    //http://localhost:8080/api/messages/search?param1=7&param2=eff3168f-974d-4a37-888f-f96a08658525
    @RequestMapping(method = RequestMethod.GET, path = "api/messages/search")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public void searchMessages(@RequestParam(name = "param1") final Integer param1,
                               @RequestParam(name = "param2", required = false) final UUID param2) {
    }
}