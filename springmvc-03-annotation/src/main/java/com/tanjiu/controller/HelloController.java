package com.tanjiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/19 14:39
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    //三个方法只需要写三个@RequestMapping即可，如果用servlet需要写三个servlet映射才可以，配置非常繁琐
    @RequestMapping("/h1")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation01");
        //会被视图解析器处理
        return "hello";
    }

    @RequestMapping("/h2")
    public String hello2(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation02");
        //会被视图解析器处理
        return "hello";
    }

    @RequestMapping("/h3")
    public String hello3(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation03");
        //会被视图解析器处理
        return "hello";
    }



}
