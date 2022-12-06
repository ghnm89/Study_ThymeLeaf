package com.root.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/test")
    public String mainText(Model model) {
        model.addAttribute("data", "Hello ThymeLeaf");

        return "index_test";
    }

    @GetMapping("/main")
    public ModelAndView main() {
        ModelAndView mnv = new ModelAndView();
        mnv.setViewName("index");
        return mnv;
    }
}
