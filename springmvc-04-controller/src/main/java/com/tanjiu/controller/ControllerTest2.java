package com.tanjiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/19 16:50
 */
//使用注解的方式来编写代码
//    @Controller代表这个类会被spring接管，只不过扫描cotroller注解的配置在springmvc-servlet.xml文件中
//    被这个注解注解的类，如果返回值是String,并且有具体的页面可以跳转，那么就会被视图解析器解析
@Controller
@RequestMapping("/t2")
public class ControllerTest2 {

    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("msg","Controller2");
        return "test";//会根据配置文件中的前缀和后缀拼接以后再跳转到相应的页面
    }
}
