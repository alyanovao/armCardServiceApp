package ru.kkb.spring2ws.armCardServiceApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CardController {

    @GetMapping("/card")
    public String card(@RequestParam(required = false) String login, Model model) {
        System.out.println("login is: " + login);
        model.addAttribute("login", login);
        return "home_page";
    }
}
