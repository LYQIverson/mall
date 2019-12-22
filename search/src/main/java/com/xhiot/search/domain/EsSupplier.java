package com.xhiot.search.domain;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

/**
 * @ClassName EsSupplier
 * Create by Liuyq on 2019/12/16 17:02
 **/
@Document(indexName = "cloud-mall",type = "supplier")
//indexName索引名称 可以理解为数据库名 必须为小写 不然会报org.elasticsearch.indices.InvalidIndexNameException异常
//type类型 可以理解为表名
public class EsSupplier {
    private String id;
    private String name;
    private String enterpriseName;

    @Field(type = FieldType.Nested)
    private List<EsSupplierAttribute> attributeList;

    public EsSupplier() {
    }

    public EsSupplier(String id, String name, String enterpriseName) {
        this.id = id;
        this.name = name;
        this.enterpriseName = enterpriseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public List<EsSupplierAttribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<EsSupplierAttribute> attributeList) {
        this.attributeList = attributeList;
    }
}
