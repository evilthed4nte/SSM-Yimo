package com.yimo.controller;

import com.mysql.cj.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class WebElementController {

    @RequestMapping("request")
    public String request(WebRequest request){
        System.out.println(request.getParameter("girl"));
        return "forward";
    }

    @RequestMapping("request2")
    public String requrst2(HttpServletRequest httpServletRequest){
        System.out.println(httpServletRequest.getParameter("boy"));
        return "forward";
    }

    @RequestMapping("request3")
    public String session(HttpSession session){
        session.setAttribute("g","temple run");
        session.getServletContext().setAttribute("ctx","UI帅 宇宙  ctx");
        return "redirect:/jsp/redirect.jsp";
    }
}
