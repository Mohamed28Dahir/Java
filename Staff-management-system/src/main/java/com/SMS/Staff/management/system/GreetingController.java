package com.SMS.Staff.management.system;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    // GET /
    @GetMapping("/")
    public String welcome() {
        return "Waxaa Kugu Soo Dhawayna REST API!";
    }

    // GET /greet/{name}
    @GetMapping("/greet/{name}")
    public String greet( ) {

        return "ASC, MDO! Ku Soo Dhawoow API.";
    }
}
