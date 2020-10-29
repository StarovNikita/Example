package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class GreetingController {

    public String mainPage(Model model){
     return "main";
 }

}