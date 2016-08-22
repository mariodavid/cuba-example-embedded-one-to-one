package com.company.embeddedonetooneexample.entity;

import javax.persistence.Embeddable;
import com.haulmont.chile.core.annotations.MetaClass;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.EmbeddableEntity;

@MetaClass(name = "emoto$Address")
@Embeddable
public class Address extends EmbeddableEntity {
    private static final long serialVersionUID = 4241034351443335091L;

    @Column(name = "STREET")
    protected String street;

    @Column(name = "POSTCODE")
    protected String postcode;

    @Column(name = "CITY")
    protected String city;

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }


}