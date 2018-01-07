package com.myapp.dao;

import com.myapp.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/1/7.
 */
public interface OrderDao extends JpaRepository<OrderEntity, Integer>{
    
}
