package com.qexample.demo.service;

//import com.example.demo.common.dao.CommonDao;
import com.qexample.demo.common.vo.QueryCondition;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WolfgangW on 10/25/17.
 */
//@Service
public class CommonService {
//    @Autowired
//    CommonDao commonDao;

    public List<Object> getQueryValues(String queryJson){
//        return commonDao.findAll(autoQuery(queryJson));
        return null;
    }

    private Specification<Object> autoQuery(String queryJson) {
        return new Specification<Object>() {
            @Override
            public Predicate toPredicate(Root<Object> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                ObjectMapper mapper = new ObjectMapper();
                List<QueryCondition> queryConditions = new ArrayList<>();
                try {
                    queryConditions = mapper.readValue(queryJson, new TypeReference<List<QueryCondition>>(){});
                } catch (IOException e) {
                    e.printStackTrace();
                }
                for (QueryCondition q: queryConditions){
                    if (q.getColumnValue() != null && !"".equals(q.getColumnValue()) && "equal".equals(q.getConditionType())){
                        predicates.add(criteriaBuilder.equal(root.get(q.getColumnName()), q.getColumnValue()));
                    }else if (q.getColumnValue() != null && !"".equals(q.getColumnValue()) && "like".equals(q.getConditionType())){
                        predicates.add(criteriaBuilder.like(root.get(q.getColumnName()), q.getColumnValue()));
                    }
                }

                return criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
            }
        };
    }
}
