package com.onlinestore.application.onlinestore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class FirstController {

    @GetMapping("/index")
    public String InstanceFirst(Model model){
        return "index";
    }
}
