package com.example.demo.dao;

import com.example.demo.entity.UUserEntity;
import javafx.beans.binding.LongExpression;
import org.hibernate.Criteria;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

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

    public List<UUserEntity> save(ArrayList<UUserEntity> uUserEntities);

    public UUserEntity save(UUserEntity uUserEntity);

    @Override
    UUserEntity findOne(Long aLong);


    @Override
    List<UUserEntity> findAll(Iterable<Long> iterable);

    public List<UUserEntity> findUUserEntitiesByNicknameOrEmail(String name, String email);

    @Override
    List<UUserEntity> findAll(Specification<UUserEntity> specification);

    @Override
    void delete(Iterable<? extends UUserEntity> iterable);

    @Override
    void delete(Long aLong);

    @Override
    void delete(UUserEntity uUserEntity);

    @Override
    void deleteInBatch(Iterable<UUserEntity> iterable);

}
