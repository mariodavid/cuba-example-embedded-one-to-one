package com.company.embeddedonetooneexample.web.customer;

import com.company.embeddedonetooneexample.entity.CustomerPreferences;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.embeddedonetooneexample.entity.Customer;

import javax.inject.Inject;

public class CustomerEdit extends AbstractEditor<Customer> {


    @Inject
    Metadata metadata;

    @Override
    protected void initNewItem(Customer item) {
        CustomerPreferences preferences = metadata.create(CustomerPreferences.class);
        item.setPreferences(preferences);


        super.initNewItem(item);
    }
}