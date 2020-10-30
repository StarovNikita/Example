package com.example.demo.Controllers;

import com.example.demo.Models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
class TopController {

    @Autowired
    private PostRepository postRepository;
    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String NameOfProduct, @RequestParam float Cost) {
        Post n = new Post();
        n.setNameOfProduct(NameOfProduct);
        n.setCoast(Cost);
        postRepository.save(n);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Post> getAllUsers() {
        // This returns a JSON or XML with the users
        return postRepository.findAll();
    }
}
