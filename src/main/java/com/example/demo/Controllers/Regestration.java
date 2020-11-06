package com.example.demo.Controllers;

import com.example.demo.Models.RegestrationPage;
import com.example.demo.repository.RegestrationPageRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Regestration {

    @Autowired
    private RegestrationPageRepositry regestrationPageRepositry;
    @GetMapping("/getReg")
    public  String RegPage(Model model){
      //  Iterable<RegestrationPage> RP = regestrationPageRepositry.findAll();
      //  model.addAttribute("RP", RP);
        return "getReg";
    }



    @PostMapping("getReg")
    public String addForLookReg(@RequestParam String firstName,@RequestParam String lastName,@RequestParam String userName, @RequestParam String email, @RequestParam String adress,@RequestParam String secondAdress, @RequestParam String country,@RequestParam String state, @RequestParam String zip,@RequestParam String nameOfCard,@RequestParam int creditCardNumber,@RequestParam int expiration,@RequestParam int CVV , Model model){
        RegestrationPage regestrationPage = new RegestrationPage(firstName, lastName, userName, email , adress , secondAdress,country, state , zip ,nameOfCard, creditCardNumber ,expiration,CVV);
        regestrationPageRepositry.save(regestrationPage);
        return "redirect:/getReg";
    }
}