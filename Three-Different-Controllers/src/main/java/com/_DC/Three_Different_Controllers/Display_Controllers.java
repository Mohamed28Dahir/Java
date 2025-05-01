package com._DC.Three_Different_Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display_Controllers {
    @GetMapping("/Display")
    public String Display() {
        return "We are Display Sprin Boot";
    }
}
