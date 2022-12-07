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
@RequestMapping("/main")
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/test")
    public String mainText(Model model) {
        model.addAttribute("data", "Hello ThymeLeaf");

        return "index_test";
    }

    @GetMapping
    public ModelAndView main() {
        ModelAndView mnv = new ModelAndView();

        List<MainTableDTO> dataList = mainService.getMainTableData();

        mnv.setViewName("index");
        mnv.addObject("dataList", dataList);

        return mnv;
    }
}
