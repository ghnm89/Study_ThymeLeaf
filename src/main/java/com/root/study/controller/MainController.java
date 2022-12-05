package com.root.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/test")
    public String mainText(Model model) {
        model.addAttribute("data", "Hello ThymeLeaf");

        return "index";
    }
}
