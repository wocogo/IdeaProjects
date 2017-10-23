package com.example.demo.service;

import com.example.demo.entity.UUserEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/23.
 */
public class UUserService {
//    method for building Specification
//    the parameter args which is depends on the front side logic
    private Specification<UUserEntity> where(final String condition, final String search){
        return new Specification<UUserEntity>() {
            @Override
            public Predicate toPredicate(Root<UUserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                return null;
            }
        };
    }
}
