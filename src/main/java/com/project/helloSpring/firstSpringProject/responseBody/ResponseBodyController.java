package com.project.helloSpring.firstSpringProject.responseBody;

import com.project.helloSpring.firstSpringProject.pathVariable.Message1;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

public class ResponseBodyController {

    @Controller
    public class MessageController {

        private final List<Message1> messages = new ArrayList<>();

        @ResponseStatus(HttpStatus.CREATED)
        @ResponseBody
        @RequestMapping(value = "/api/messages", method = RequestMethod.POST)
        public void createMessage(@RequestBody final Message1 message) {
            messages.add(message);
        }

        @ResponseStatus(HttpStatus.NO_CONTENT)
        @ResponseBody
        @RequestMapping(value = "/api/messages/{index}", method = RequestMethod.PUT)
        public void updateMessage(@RequestBody final Message1 message, @PathVariable final Integer index) {
            messages.get(index).setText(message.getText());
        }
    }
}
