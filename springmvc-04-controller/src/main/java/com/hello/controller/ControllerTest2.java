package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {
    @RequestMapping("/t0")
    public String test1(Model model) {
        //封装数据
        model.addAttribute("msg","ControllerTest2");
        return "hello";//会被视图解析器处理
    }
    @RequestMapping("/t2")
    public String test2(Model model) {
        //封装数据
        model.addAttribute("msg","ControllerTest2");
        return "test";//会被视图解析器处理
    }
    @RequestMapping("/t3")
    public String test3(Model model) {
        //封装数据
        model.addAttribute("msg","ControllerTest2");
        return "test";//会被视图解析器处理
    }
}
