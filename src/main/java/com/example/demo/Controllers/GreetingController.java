package com.example.demo.Controllers;


import com.example.demo.Models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


public class GreetingController {

    @GetMapping("/")
    public String mainPage( Model model){



        return "mainPage";
 }

}
@Controller
class Regestration {
    @GetMapping("/getReg")
    public  String RegPage(Model model){ return "getReg";}
}
@Controller
 class Authorization {
    @GetMapping("/signPage")
    public String signPage(Model model){
        return "signPage";
    }

}
@Controller
class Catalog{
    @GetMapping("/catalogPage")
    public  String catalogPage(Model model) {return "catalogPage";}
}

@Controller
class  Support{
    @GetMapping("/supportPage")
    public String supportPage(Model model) {return "supportPage";}
}
