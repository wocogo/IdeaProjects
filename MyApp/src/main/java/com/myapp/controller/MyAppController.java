package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/27.
 */
@Controller
public class MyAppController {
    @RequestMapping(value = {"/", "/index"})
    public String index(){
        return "index";
    }
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
}
