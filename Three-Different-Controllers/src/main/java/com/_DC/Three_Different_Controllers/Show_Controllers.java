package com._DC.Three_Different_Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Show_Controllers {

    @GetMapping("/Show")

    public String Show() {
        return "Welcome To Spring Boot";
    }
}
