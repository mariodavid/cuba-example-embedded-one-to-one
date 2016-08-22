-- begin EMOTO_CUSTOMER
create table EMOTO_CUSTOMER (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS_STREET varchar(255),
    ADDRESS_POSTCODE varchar(255),
    ADDRESS_CITY varchar(255),
    --
    NAME varchar(255),
    PREFERENCES_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end EMOTO_CUSTOMER
-- begin EMOTO_CUSTOMER_PREFERENCES
create table EMOTO_CUSTOMER_PREFERENCES (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FAVORITE_CATEGORY_ID varchar(36),
    FAVORITE_LANGUAGE varchar(255),
    --
    primary key (ID)
)^
-- end EMOTO_CUSTOMER_PREFERENCES
-- begin EMOTO_PRODUCT_CATEGORY
create table EMOTO_PRODUCT_CATEGORY (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer not null,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    --
    primary key (ID)
)^
-- end EMOTO_PRODUCT_CATEGORY
