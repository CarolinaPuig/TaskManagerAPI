package br.com.fiap.cp4digitalBusiness.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login?logout"; 
     }
}
