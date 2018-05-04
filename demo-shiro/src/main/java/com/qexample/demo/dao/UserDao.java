package com.qexample.demo.dao;

import com.qexample.demo.entity.UUserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Created by WolfgangW on 09/27/17.
 */
public interface UserDao extends JpaRepository<UUserEntity, Long>, JpaSpecificationExecutor<UUserEntity>, UserDaoCustom {
    @Override
    List<UUserEntity> findAll(Specification<UUserEntity> specification);

    List<UUserEntity> findByNickname(String nickName);




}




