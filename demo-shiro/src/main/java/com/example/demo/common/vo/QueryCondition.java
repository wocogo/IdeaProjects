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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnValue() {
        return columnValue;
    }

    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }

    public Type getDataType() {
        return dataType;
    }

    public void setDataType(Type dataType) {
        this.dataType = dataType;
    }

    public String getConditionType() {
        return conditionType;
    }

    public void setConditionType(String conditionType) {
        this.conditionType = conditionType;
    }
}
