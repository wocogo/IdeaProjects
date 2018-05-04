package com.qexample.demo.dao;

import com.qexample.demo.entity.UUserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/27.
 */
//CrudRepository(implements the base crud)
//    has been changed to
//JpaRepository(implements the JPA standard)
@Transactional
public interface UUserDao extends JpaRepository<UUserEntity, Long>, JpaSpecificationExecutor<UUserEntity>{

    List<UUserEntity> save(ArrayList<UUserEntity> uUserEntities);

    UUserEntity save(UUserEntity uUserEntity);

    @Override
    UUserEntity findOne(Long aLong);


    @Override
    List<UUserEntity> findAll(Iterable<Long> iterable);

    List<UUserEntity> findUUserEntitiesByNicknameOrEmail(String name, String email);

    @Override
    List<UUserEntity> findAll(Specification<UUserEntity> specification);

    @Override
    void delete(Iterable<? extends UUserEntity> iterable);

    @Override
    void delete(Long aLong);

//    @Override
//    void delete(UUserEntity uUserEntity);

    @Override
    void deleteInBatch(Iterable<UUserEntity> iterable);


}
