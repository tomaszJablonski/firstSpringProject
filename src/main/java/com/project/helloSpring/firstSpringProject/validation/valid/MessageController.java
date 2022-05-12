package com.project.helloSpring.firstSpringProject.validation.valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/*
Adnotację @Valid, najczęściej wykorzystujemy
na warstwie webowej, przy obiekcie
oznaczonym adnotacją @RequestBody.
 */

@RestController
public class MessageController {

    @PostMapping("/api/messages")
    public void sendMessage(@Valid @RequestBody final Message message) {
        // handle message sending on service layer
    }
}