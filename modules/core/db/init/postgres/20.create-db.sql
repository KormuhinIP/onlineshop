-- begin ONLINESHOP_BUYER
alter table ONLINESHOP_BUYER add constraint FK_ONLINESHOP_BUYER_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_ONLINESHOP_BUYER_ON_USER on ONLINESHOP_BUYER (USER_ID)^
-- end ONLINESHOP_BUYER
-- begin SEC_USER
alter table SEC_USER add constraint FK_SEC_USER_ON_BUYER foreign key (BUYER_ID) references ONLINESHOP_BUYER(ID)^
create index IDX_SEC_USER_ON_BUYER on SEC_USER (BUYER_ID)^
-- end SEC_USER
