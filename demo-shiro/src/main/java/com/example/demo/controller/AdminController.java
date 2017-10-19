package com.example.demo.controller;

import com.example.demo.entity.UUserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @RequestMapping(value = "admin/user")
    public String user(){
        System.out.println("userPage");

        return "admin/user";
    }

    @RequestMapping(value = "admin/user/edit", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,String> editUser(HttpServletRequest request){
        String userEntryListJson = request.getParameter("data");
//        userEntityList = JacksonMapper
        ArrayList<UUserEntity> userEntityList = null;
        System.out.println(userEntityList);
        Map<String,String> returnMap = new HashMap<>();
        return returnMap;
    }

    @RequestMapping(value = "admin/permission")
    public String permission(){
        System.out.println("permissionPage");
        return "admin/permission";
    }
    @RequestMapping(value = "admin/role")
    public String role(){
        System.out.println("rolePage");
        return "admin/role";
    }
    @RequestMapping(value = "admin/button")
    public String buttonTest(){
        System.out.println("buttonTestPage");
        return "admin/buttonTest";
    }
}
