package com.root.study.controller;

import com.root.study.Service.MainService;
import com.root.study.dto.MainTableDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/test")
    public String mainText(Model model) {
        model.addAttribute("data", "Hello ThymeLeaf");

        return "index_test";
    }

    @GetMapping("/index")
    public ModelAndView main() {
        ModelAndView mnv = new ModelAndView();

        List<MainTableDTO> dataList = mainService.getMainTableData();

        mnv.setViewName("index");
        mnv.addObject("dataList", dataList);

        return mnv;
    }

    @GetMapping("/main/charts")
    public String charts() {
        return "pages/main/charts";
    }

    @GetMapping("/main/layout-sidenav-light")
    public String layoutSidenav() {
        return "pages/main/layout-sidenav-light";
    }

    @GetMapping("/main/layout-static")
    public String layoutStatic() {
        return "pages/main/layout-static";
    }

    @GetMapping("/main/tables")
    public String tables() {
        return "pages/main/tables";
    }

    @GetMapping("/auth/login")
    public String login() {
        return "pages/auth/login";
    }

    @GetMapping("/auth/password")
    public String password() {
        return "pages/auth/password";
    }

    @GetMapping("/auth/register")
    public String register() {
        return "pages/auth/register";
    }

    @GetMapping("/errors/401")
    public String error401() {
        return "pages/errors/401";
    }

    @GetMapping("/errors/404")
    public String error404() {
        return "pages/errors/404";
    }

    @GetMapping("/errors/500")
    public String error500() {
        return "pages/errors/500";
    }
}
