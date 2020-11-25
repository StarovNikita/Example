package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Authorization {
    @GetMapping("/signPage")
    public String signPage(Model model){

        return "signPage";

    }

}