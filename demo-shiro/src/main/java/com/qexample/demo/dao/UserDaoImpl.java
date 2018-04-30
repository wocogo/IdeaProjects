package com.qexample.demo.dao;

import com.qexample.demo.entity.UUserEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by WolfgangW on 01/15/18.
 */
public class UserDaoImpl implements UserDaoCustom {
    @PersistenceContext
    private EntityManager em;
    @Override
    @Transactional
    public UUserEntity merge(UUserEntity entity) {
        return em.merge(entity);
    }

}
