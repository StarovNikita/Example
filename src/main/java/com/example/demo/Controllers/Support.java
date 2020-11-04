package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  Support{
    @GetMapping("/supportPage")
    public String supportPage(Model model) {return "supportPage";}
}