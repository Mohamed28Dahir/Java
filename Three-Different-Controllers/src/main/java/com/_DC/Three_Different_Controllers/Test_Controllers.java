package com._DC.Three_Different_Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test_Controllers {
    @GetMapping("/Test")
    public String HelloSpring(){
        return "Hello Spring Words";
    }
}
