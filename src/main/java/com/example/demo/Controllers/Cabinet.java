package com.example.demo.Controllers;

import com.example.demo.Models.RegestrationPage;
import com.example.demo.repository.RegestrationPageRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Cabinet {
    @Autowired
    private RegestrationPageRepositry regestrationPageRepositry;
    @GetMapping("/cabinetPage")
    public String supportPage(Model model) {
        Iterable<RegestrationPage> posts = regestrationPageRepositry.findAll();
        model.addAttribute("posts", posts);
        return "cabinetPage";}
}