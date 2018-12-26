package com.yimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HiController {
    //zhuanfa
    @RequestMapping("/forward")
    public String forward(Model model){
        System.out.println("11111for");
        model.addAttribute("skill","sleeping");

        return "forward";
    }

    @RequestMapping("/redirect")
    public String redirect(Model model){
        model.addAttribute("skill","cooking");
        System.out.println("43543534654");
        return "redirect:/jsp/redirect.jsp";
    }

    @RequestMapping("/forward2")
    public String forwardAnotherController(){
        return "forward:/baby/hello";
    }
}
