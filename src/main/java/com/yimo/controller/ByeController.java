package com.yimo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//不需要继承任何类和任何接口
@Controller
@RequestMapping("bye")

public class ByeController {
    //ModelAndView Model+View
    @RequestMapping("/bye")
    public String bye(Model model){
        model.addAttribute("model1","modeller -2");
        //return的是viewName'
        //此时去的是/jsp/bye.jsp
        return "bye";

    }

    @RequestMapping("/goodBye")
    public String goodBye(Model model){
        model.addAttribute("boy","心机男孩");

        return "bye";
    }
}
