package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/17.
 */
@RestController
@RequestMapping("/home")
public class UserController {
    @RequestMapping(value = "/user2")
    @ResponseBody
    public String sayHi(){
        return "Hi";
    }

}
