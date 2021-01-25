package com.tanjiu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 叹久
 * @date 2021/1/24 13:22
 */
@RestController
@RequestMapping("ajajx")
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }
}
