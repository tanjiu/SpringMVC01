package com.tanjiu.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/19 16:28
 */

//使用xml的方式来配置请求，需要class类继承Cotroller接口，而且每个请求都要配置一个bean，对大型项目来说很繁琐，一般使用注解的方式来写代码
//    <!--    注意，springmvc如果通过xml来配置请求所对应的处理类的话，name要加/-->
//    <bean name="/t1" class="com.tanjiu.controller.ControllerTest1"/>
//只要继承了Controller接口，就说明这个类是一个控制器了
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ControllerTest1");
        mv.setViewName("test");
        return mv;
    }
}
