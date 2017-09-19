package com.example.demo.web;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/17.
 */
@RestController
@RequestMapping("/home")
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/user2")
    @ResponseBody
    public String sayHi(String userName){
        String userId;
        UserEntity userEntity = userDao.findByName(userName);
        if(userEntity != null){
            return userName + " : nickName: " + userEntity.getNickName();
        }else{
            return userName + " does not exists";
        }
    }

}
