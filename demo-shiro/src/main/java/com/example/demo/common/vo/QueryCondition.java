package com.example.demo.common.vo;

import java.lang.reflect.Type;

/**
 * Created by WolfgangW on 10/25/17.
 */

public class QueryCondition {
    private String columnName;
    private String columnValue;
    private Type dataType;
    //lt,gt,bt...
    private String conditionType;
}
