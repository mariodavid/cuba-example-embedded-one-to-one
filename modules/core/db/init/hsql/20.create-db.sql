-- begin EMOTO_CUSTOMER
alter table EMOTO_CUSTOMER add constraint FK_EMOTO_CUSTOMER_PREFERENCES_ID foreign key (PREFERENCES_ID) references EMOTO_CUSTOMER_PREFERENCES(ID)^
-- end EMOTO_CUSTOMER
-- begin EMOTO_CUSTOMER_PREFERENCES
alter table EMOTO_CUSTOMER_PREFERENCES add constraint FK_EMOTO_CUSTOMER_PREFERENCES_FAVORITE_CATEGORY_ID foreign key (FAVORITE_CATEGORY_ID) references EMOTO_PRODUCT_CATEGORY(ID)^
create index IDX_EMOTO_CUSTOMER_PREFERENCES_FAVORITE_CATEGORY on EMOTO_CUSTOMER_PREFERENCES (FAVORITE_CATEGORY_ID)^
-- end EMOTO_CUSTOMER_PREFERENCES
