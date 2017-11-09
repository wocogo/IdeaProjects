package com.example.demo.controller;

import com.example.demo.entity.UUserEntity;
import com.example.demo.service.UUserService;
import com.example.demo.vo.UUser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.web.JsonProjectingMethodInterceptorFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by WolfgangW on 09/26/17.
 */
@Controller
public class AdminController {
    @Qualifier("UUserServiceImpl")
    @Autowired
    UUserService uUserService;

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
    public Map<String,String> editUser(HttpServletRequest request) throws IOException {
        String userEntryListJson = request.getParameter("data");
        ObjectMapper mapper = new ObjectMapper();
        List<UUserEntity> userEntityList = mapper.readValue(userEntryListJson, new TypeReference<List<UUserEntity>>(){});
        uUserService.save(userEntityList);
        Map<String,String> returnMap = new HashMap<>();
        return returnMap;
    }

    @RequestMapping(value = "admin/user/query", method = RequestMethod.POST)
    @ResponseBody
    public String queryUser(HttpServletRequest request) throws IOException {
        String userEntryJson = request.getParameter("queryData");
        ObjectMapper mapper = new ObjectMapper();
        UUserEntity uUserEntity = mapper.readValue(userEntryJson, UUserEntity.class);
        ArrayList<UUserEntity> uUserEntityList4Query = new ArrayList<>();
        uUserEntityList4Query.add(uUserEntity);
//        List<UUserEntity> userEntityList = uUserDao.findUUserEntitiesByNicknameOrEmail(uUserEntity.getNickname(), uUserEntity.getEmail());
//        List<UUserEntity> userEntityList = uUserService.getUUser(uUserEntity);
        List<UUserEntity> userEntityList = uUserService.findAll(uUserEntity);
        String userEntityListStr = mapper.writeValueAsString(userEntityList);
        List<UUser> uUserList = mapper.readValue(userEntityListStr, new TypeReference<List<UUser>>(){});
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("result", uUserList);

//        test code here
//        String queryJson = request.getParameter("queryCondition");
//        List<QueryCondition> queryConditions = mapper.readValue(queryJson, new TypeReference<List<QueryCondition>>() {});
//        List<Object> uuuList = commonService.getQueryValues(queryJson);
        String result = mapper.writeValueAsString(returnMap);
        return result;
    }

    @RequestMapping(value = "admin/user/delete", method = RequestMethod.POST)
    @ResponseBody
    public String deleteUser(HttpServletRequest request) throws IOException {
        String userEntryListJson = request.getParameter("data");
        ObjectMapper mapper = new ObjectMapper();
        List<UUserEntity> userEntityList = mapper.readValue(userEntryListJson, new TypeReference<List<UUserEntity>>(){});
        uUserService.delete(userEntityList);
        System.out.println("success!!!");
        return "success";
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
