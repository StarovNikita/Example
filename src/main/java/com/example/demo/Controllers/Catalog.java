package com.example.demo.Controllers;

import com.example.demo.Models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Catalog{
    @Autowired
    private PostRepository postRepository;
    @GetMapping ("/catalogPage")
    public  String catalogPage(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "catalogPage";
    }

    @GetMapping("/catalogPage/add")
    public String addCatalog(Model model){

        return "catalog-add";
    }
    @PostMapping("/catalogPage/add")
    public String addPostCatalog(@RequestParam String nameOfProduct,@RequestParam String descriptionOfProduct, Model model){
        Post post = new Post(nameOfProduct,descriptionOfProduct);
        postRepository.save(post);
        return "redirect:/catalogPage";
    }
}