package com.shk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
        @RequestMapping("/hello")
        public String hello(Model model){
            model.addAttribute("msg","523真帅");
            return "hello";//会被视图解析器处理
        }
    }
