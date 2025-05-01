package com.Web.Page.Thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.engine.AttributeName;

import java.security.PublicKey;

@Controller
public class Hello_My_Friends {

    @GetMapping("/ask")
    public String getModel(Model model){
        model.addAttribute(
                "message",
                "Hello world we spring"
        );
        return "hello-view";
    }
}
