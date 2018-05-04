package com.qexample.demo.dao;

import com.qexample.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;;

import javax.transaction.Transactional;


/**
 * Created by WolfgangW on 09/19/17.
 */
@Transactional
public interface UserDao extends CrudRepository<UserEntity, Long>{
    public UserEntity findByName(String name);
}
