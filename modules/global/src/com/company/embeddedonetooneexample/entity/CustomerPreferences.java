package com.company.embeddedonetooneexample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Table(name = "EMOTO_CUSTOMER_PREFERENCES")
@Entity(name = "emoto$CustomerPreferences")
public class CustomerPreferences extends StandardEntity {
    private static final long serialVersionUID = 1391456511194331933L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FAVORITE_CATEGORY_ID")
    protected ProductCategory favoriteCategory;

    @Column(name = "FAVORITE_LANGUAGE")
    protected String favoriteLanguage;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "preferences")
    protected Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }


    public ProductCategory getFavoriteCategory() {
        return favoriteCategory;
    }

    public void setFavoriteCategory(ProductCategory favoriteCategory) {
        this.favoriteCategory = favoriteCategory;
    }



}