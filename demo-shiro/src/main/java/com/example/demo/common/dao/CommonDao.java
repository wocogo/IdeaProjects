package com.example.demo.common.dao;


import com.example.demo.entity.UUserEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 10/25/17.
 */
//@Transactional
//public interface CommonDao extends JpaRepository<Object, Long>, JpaSpecificationExecutor<Object>{
//    @Override
//    public Object save(Object o);
//
//    @Override
//    Object findOne(Long aLong);
//
//    public List<Object> save(ArrayList<Object> os);
//
//    public List<Object> findAll(Specification<Object> specification);
//}
