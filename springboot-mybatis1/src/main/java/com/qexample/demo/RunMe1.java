package com.qexample.demo;


import com.qexample.demo.dao.UserMapper;
import com.qexample.demo.vo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/12.
 */
@RestController
@RequestMapping({"/home"})
public class RunMe1 {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/user")
    @ResponseBody
    public String sayHey(){
        TUser user = userMapper.findByUserName("evan");
        System.out.println("sayHey");
        System.out.println(user);
        TUser user1 = userMapper.findByUserId(1);
        System.out.println(user1);
        return user.getUSER_NAME()+"------"+user.getUserEmail();
    }
}
