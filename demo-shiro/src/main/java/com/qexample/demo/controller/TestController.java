package com.qexample.demo.controller;

import com.qexample.demo.dao.UUserDao;
import com.qexample.demo.dao.UserDao;
import com.qexample.demo.entity.UUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WolfgangW on 01/15/18.
 */
@RestController
public class TestController {
    @Autowired
    UserDao userDao;
    @Autowired
    UUserDao uUserDao;

    @RequestMapping(value = "testMerge")
    public UUserEntity testMerge(String ins){
        UUserEntity userEntity = new UUserEntity();
        userEntity.setId(10030);
        userEntity.setEmail("aab");
        userEntity.setNickname("testMerge_bbb");
        userDao.save(userEntity);
//        return userDao.merge(userEntity);
        return null;
    }
}
