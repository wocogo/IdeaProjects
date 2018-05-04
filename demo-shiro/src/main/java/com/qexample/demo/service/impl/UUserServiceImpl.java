package com.qexample.demo.service.impl;

import com.qexample.demo.dao.UUserDao;
import com.qexample.demo.entity.UUserEntity;
import com.qexample.demo.service.UUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 10/26/17.
 */
@Service
public class UUserServiceImpl implements UUserService{
    @Autowired
    UUserDao uUserDao;

    @Override
    public List<UUserEntity> findAll(UUserEntity uUserEntity) {
        return uUserDao.findAll(where(uUserEntity));
    }

    @Override
    public UUserEntity save(UUserEntity uUserEntity) {
        return uUserDao.save(uUserEntity);
    }

    @Override
    public List<UUserEntity> save(List<UUserEntity> userEntityList) {
        return uUserDao.save(userEntityList);
    }

    @Override
    public void delete(List<UUserEntity> userEntityList) {
//        Iterable<UUserEntity> it = null;
        uUserDao.delete(userEntityList);
    }



    //    method for building Specification
//    the parameter args which is depends on the front side logic
    private Specification<UUserEntity> where(UUserEntity uUserEntity){
        return new Specification<UUserEntity>() {
            @Override
            public Predicate toPredicate(Root<UUserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if (uUserEntity.getNickname() != null &&  !"".equals(uUserEntity.getNickname()))
                predicates.add(criteriaBuilder.equal(root.get("nickname"), uUserEntity.getNickname()));
                if (uUserEntity.getEmail() != null &&  !"".equals(uUserEntity.getEmail()))
                predicates.add(criteriaBuilder.like(root.get("email"), "%"+uUserEntity.getEmail()+"%"));
                return criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
            }
        };
    }
}
