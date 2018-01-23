package com.myapp.controller;

import com.myapp.dao.OrderDao;
import com.myapp.entity.test.OrderEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/1/7.
 */
@Slf4j
@RestController
public class BizController {
    @Autowired
    OrderDao orderDao;
    @RequestMapping(value = "/order")
    public OrderEntity testOrder(){
        log.info("aaa");
        OrderEntity orderEntity = orderDao.findOne(1);
        return orderEntity;
    }
}
