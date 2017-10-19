package com.example.demo.dao;

import com.example.demo.entity.UUserEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
@Transactional
public interface UUserDao extends CrudRepository<UUserEntity, Long>{

    public List<UUserEntity> save(List<UUserEntity> uUserEntities);

    public UUserEntity save(UUserEntity uUserEntity);
}
