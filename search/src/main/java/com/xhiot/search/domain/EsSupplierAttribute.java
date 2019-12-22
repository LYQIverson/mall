package com.xhiot.search.domain;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 搜索中的商品属性信息
 * @ClassName EsSupplierAttribute
 * Create by Liuyq on 2019/12/17 8:43
 **/
public class EsSupplierAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性名称
    @Field(type=FieldType.Keyword)
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
