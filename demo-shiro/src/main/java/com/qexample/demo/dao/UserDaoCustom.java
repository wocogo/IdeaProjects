package com.qexample.demo.dao;

import com.qexample.demo.entity.UUserEntity;

/**
 * Created by WolfgangW on 01/15/18.
 */
public interface UserDaoCustom {
    UUserEntity merge(UUserEntity entity);
}
