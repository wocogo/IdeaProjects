package com.example.demo.service;

import com.example.demo.entity.UUserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */
@Service
public interface UUserService {

//    find by UUserEntity
    public List<UUserEntity> findAll(UUserEntity uUserEntity);

//    save UUserEntity
    public UUserEntity save(UUserEntity uUserEntity);

//    UUserEntity list save
    public List<UUserEntity> save(List<UUserEntity> userEntityList);

    public String delete(List<UUserEntity> userEntityList);

}
