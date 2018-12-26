package com.yimo.controller;

import com.yimo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/m1")
//    这个注解将指导返回的不是视图 是它会将数据转换为json格式
    @ResponseBody
    public User m1(){
        User u = new User();
        u.setName("许晴");
        u.setAge(32);
        u.setPwd("2332312");
        return u;
    }

    @RequestMapping("/m2")
    @ResponseBody
    public Map<String, Object> m2(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","范青");
        map.put("age","28");
        return map;
    }
}
