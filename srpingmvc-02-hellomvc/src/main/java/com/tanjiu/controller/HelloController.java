package com.tanjiu.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/18 21:38
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
//        业务代码
        String result="HelloSpringMVC";
        mv.addObject("msg",result);
//        视图跳转
        mv.setViewName("test");
        return mv;
    }
}
