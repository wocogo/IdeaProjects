package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WolfgangW on 09/27/17.
 */
@Controller
public class ViewController {
    @RequestMapping(value = "view")
    public String view(){
        return "view/index";
    }
}
