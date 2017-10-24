package com.example.demo.service;

import com.example.demo.dao.UUserDao;
import com.example.demo.entity.UUserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/23.
 */
@Service
public class UUserService {
    @Autowired
    UUserDao uUserDao;

    public List<UUserEntity> getUUser(UUserEntity uUserEntity){
        return uUserDao.findAll(where(uUserEntity));
    }
//    method for building Specification
//    the parameter args which is depends on the front side logic
    private Specification<UUserEntity> where(UUserEntity uUserEntity){
        return new Specification<UUserEntity>() {
            @Override
            public Predicate toPredicate(Root<UUserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                predicates.add(criteriaBuilder.equal(root.get("nickname"), uUserEntity.getNickname()));
                predicates.add(criteriaBuilder.equal(root.get("email"), uUserEntity.getEmail()));
                return criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
            }
        };
    }
}
