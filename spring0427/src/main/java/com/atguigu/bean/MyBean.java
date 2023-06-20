package com.atguigu.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyBean {
    private List dataList;
    private Set dataSet;
    private Map dataMap;
    private Properties dataProperties;
    private String[] dataArray;

    public String[] getDataArray() {
        return dataArray;
    }

    public void setDataArray(String[] dataArray) {
        this.dataArray = dataArray;
    }

    public List getDataList() {
        return dataList;
    }

    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    public Set getDataSet() {
        return dataSet;
    }

    public void setDataSet(Set dataSet) {
        this.dataSet = dataSet;
    }

    public Map getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map dataMap) {
        this.dataMap = dataMap;
    }

    public Properties getDataProperties() {
        return dataProperties;
    }

    public void setDataProperties(Properties dataProperties) {
        this.dataProperties = dataProperties;
    }
}