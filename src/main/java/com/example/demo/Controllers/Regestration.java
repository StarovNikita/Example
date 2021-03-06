package com.example.demo.Controllers;

import com.example.demo.Models.Post;
import com.example.demo.Models.RegestrationPage;
import com.example.demo.repository.RegestrationPageRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@Controller
public class Regestration {

    @Autowired
    private RegestrationPageRepositry regestrationPageRepositry;
    @GetMapping("/getReg")
    public String addCatalog(Model model){

        return "getReg";
    }

    @PostMapping("/getReg")
    public String addForLookReg(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String userName, @RequestParam String email, @RequestParam String adress , Model model){
        RegestrationPage regestrationPage = new RegestrationPage(firstName, lastName, userName, email , adress);
       // RegestrationPage regestrationPage = regestrationPageRepositry.findByUserName(user.getUserName());

        regestrationPageRepositry.save(regestrationPage);
        return "redirect:/cabinetPage";
    }
}