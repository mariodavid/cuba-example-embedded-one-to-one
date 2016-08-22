package com.company.embeddedonetooneexample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

@NamePattern("%s|name")
@Table(name = "EMOTO_PRODUCT_CATEGORY")
@Entity(name = "emoto$ProductCategory")
public class ProductCategory extends StandardEntity {
    private static final long serialVersionUID = 6637954941308934825L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}