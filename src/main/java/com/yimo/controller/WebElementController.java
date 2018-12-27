package com.yimo.controller;

import com.mysql.cj.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
        session.getServletContext().setAttribute("context","UI帅 宇宙  ctx");
        return "redirect:/jsp/redirect.jsp";
    }

    //@RequestMapping(value = {"/m1","/m2"})
    @RequestMapping(path = {"/m1","m2"},method = {RequestMethod.GET})
    public String m1(){
        System.out.println("m1....");
        return "forward";
    }

    //通过params表示需要的参数
    @RequestMapping(path = {"/m2"},params = {"girl=wangfei","boy!=guandong"})
    public String m2(){
        System.out.println("m2....");
        return "forward";
    }

//    任意的字符 斜杠除外
//    @RequestMapping(path = {"/m3?"})
//    0-n 任意个字符
//    @RequestMapping(path = {"/m3*"})
//
    @RequestMapping(path = {"/m3/**"})
    public String m3(){
        System.out.println("m3....");
        return "forward";
    }

    @GetMapping(path = ("/m4"))
    public String m4(){
        System.out.println("m4");
        return "forward";
    }

    @DeleteMapping(path = ("/m5"))
    public String m5(){
        System.out.println("m5");
        return "forward";
    }
}
