package com.example.demo.dao;

import com.example.demo.entity.UUserEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/9/27.
 */
@Transactional
public interface UUserDao extends CrudRepository<UUserEntity, Long>{
}
