package com.tanjiu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanjiu.pojo.User;
import com.tanjiu.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/19 20:56
 */
//@Controller会直接被视图解析器解析
//返回json字符串注解要@Controller和@ReponseBody一起使用，或者只使用@RestController注解也可以
@Controller
public class UserController {

    //调用JsonUtils工具类
    @RequestMapping("/j3")
    //该注解返回一个json字符串，不会走视图解析器
    @ResponseBody
    public String json3() throws JsonProcessingException {
        User user = new User("tanjiu", 13, "男");
        Date date = new Date();
//        return JsonUtils.getJson(user);
//          return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
        return JsonUtils.getJson(date);
    }


    @RequestMapping("/j1")
    //该注解返回一个json字符串，不会走视图解析器
    @ResponseBody
    public String json1(){
//        创建一个对象
        User user=new User("tanjiu",13,"男");

//        return "test";//因为有@ResponseBody,会直接返回"test"字符串，而不是视图页面
        return user.toString();
    }


    //用导入的jackson-databind包下的转化函数来将数据转化为json串
    @RequestMapping("/j2")
    //该注解返回一个json字符串，不会走视图解析器
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //      用导入的jackson-databind包下的转化函数来将数据转化为json串
        //jackson  ObjectMapper
        ObjectMapper mapper=new ObjectMapper();

        //        创建一个对象
        User user=new User("tanjiu",13,"男");
        //将一个对象转化为json串
       String str= mapper.writeValueAsString(user);
        return str;
        //返回结果为键值对形式的Json串
        //{"name":"tanjiu","age":13,"sex":"?"}
    }





    //调用fastjson进行数据转化，只需要导入依赖即可使用
    @RequestMapping("/j4")
    //该注解返回一个json字符串，不会走视图解析器
    @ResponseBody
    public String json4()  {
        User user=new User("tanjiu",1233,"男");
        String jsonString = JSON.toJSONString(user);
            return jsonString;
    }

}
