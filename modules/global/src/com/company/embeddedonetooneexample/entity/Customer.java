package com.company.embeddedonetooneexample.entity;

import javax.persistence.*;

import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "EMOTO_CUSTOMER")
@Entity(name = "emoto$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -4012557724305772189L;

    @Column(name = "NAME")
    protected String name;

    @OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "PREFERENCES_ID")
    protected CustomerPreferences preferences;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "street", column = @Column(name = "ADDRESS_STREET")),
        @AttributeOverride(name = "postcode", column = @Column(name = "ADDRESS_POSTCODE")),
        @AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY"))
    })
    protected Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }


    public void setPreferences(CustomerPreferences preferences) {
        this.preferences = preferences;
    }

    public CustomerPreferences getPreferences() {
        return preferences;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}