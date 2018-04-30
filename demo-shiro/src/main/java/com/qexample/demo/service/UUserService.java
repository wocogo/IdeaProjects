package com.qexample.demo.service;

import com.qexample.demo.entity.UUserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */
@Service
public interface UUserService {

//    find by UUserEntity
    List<UUserEntity> findAll(UUserEntity uUserEntity);

//    save UUserEntity
    UUserEntity save(UUserEntity uUserEntity);

//    UUserEntity list save
    List<UUserEntity> save(List<UUserEntity> userEntityList);

    void delete(List<UUserEntity> userEntityList);

}
