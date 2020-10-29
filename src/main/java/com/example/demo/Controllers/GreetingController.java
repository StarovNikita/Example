package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {
    @GetMapping("/")
    public String mainPage(Model model){
     return "mainPage";
 }

}

class Regestration {
    @GetMapping("/getReg")
    public  String RegPage(Model model){ return "getReg";}
}