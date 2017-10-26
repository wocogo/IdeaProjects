package com.example.demo.dao;

import com.example.demo.entity.UUserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by WolfgangW on 09/27/17.
 */
public interface UserDao extends JpaRepository<UUserEntity, Long>, JpaSpecificationExecutor<UUserEntity>{
    @Override
    List<UUserEntity> findAll(Specification<UUserEntity> specification);

    List<UUserEntity> findByNickname(String nickName);




}




