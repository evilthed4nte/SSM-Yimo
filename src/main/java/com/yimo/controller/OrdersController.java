package com.yimo.controller;


import com.yimo.pojo.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("orders")
public class OrdersController {

    @RequestMapping("/addOrder")
    public String addOrders(Model model){
        List<Orders> list = new ArrayList<>();

        Orders ods = new Orders();
        ods.setName("帅哥d订单");
        ods.setId("1");
        ods.setTotal(3331.3);

        Orders ods2 = new Orders();
        ods2.setName("这个第二个");
        ods2.setId("2");
        ods2.setTotal(2222.22);

        list.add(ods);
        list.add(ods2);

        model.addAttribute("orders",list);
        return "orders";
    }
}
