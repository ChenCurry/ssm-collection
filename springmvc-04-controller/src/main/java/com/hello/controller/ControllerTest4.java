package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest4 {
    @RequestMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {//@PathVariable 与 @RequestParam 的区别
        int result = a + b;
        //封装数据
        model.addAttribute("msg","结果为："+result);
        return "test";
    }
}
