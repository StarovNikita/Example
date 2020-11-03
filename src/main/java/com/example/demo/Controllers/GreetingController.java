package com.example.demo.Controllers;


import com.example.demo.Models.Post;
import com.example.demo.repository.PostRepository;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetingController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/mainPage")
    public String mainPage(Model model){
    Iterable<Post> posts = postRepository.findAll();
    model.addAttribute("posts", posts);
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