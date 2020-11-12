package com.example.demo.Controllers;

import com.example.demo.Models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
public class Cabinet {
    @GetMapping("/cabinetPage")
    public String supportPage(Model model) {return "cabinetPage";}


}