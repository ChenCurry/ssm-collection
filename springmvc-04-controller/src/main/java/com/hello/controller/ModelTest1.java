package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
    @RequestMapping("/m1/t1")
    public String test1(Model model) {
        //封装数据
        model.addAttribute("msg", "ModelTest1");
        //return "/WEB-INF/jsp/test.jsp";
        //return "forward:/WEB-INF/jsp/test.jsp";
        return "redirect:/index.jsp";//不配置视图解析器的情况
    }
}