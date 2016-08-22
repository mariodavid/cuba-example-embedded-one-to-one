# CUBA Platform One-to-One and Embedded example

This is an example CUBA project (https://www.cuba-platform.com) to illustrate a working example of the following features:

* Embedded types
* One to One Entity types

The are the following Entities:

* Customer
* CustomerPreferences
* Address
* Product Category

A Customer has one to one relationship to CustomerPreferences. Additionally a Customer has an Address as an embedded type.
A CustomerPreferences has a many to one relationship to a ProductCategory (just for showing that associations within this 1:1 relationship works as well).