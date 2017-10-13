package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WolfgangW on 09/26/17.
 */
@Controller
public class AdminController {
    @RequestMapping(value = "admin/mgmt")
    public String login(){
        return "admin/mgmt";
    }
    @RequestMapping(value = "admin/main")
    public String main(){
        return "admin/main";
    }
}
