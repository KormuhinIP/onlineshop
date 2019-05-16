create table ONLINESHOP_BUYER (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    ADDRESS_CITY varchar(255) not null,
    ADDRESS_STREET varchar(255) not null,
    ADDRESS_HOUSE varchar(255) not null,
    --
    FULL_NAME varchar(255) not null,
    USER_ID uuid,
    --
    -- from onlineshop$NaturalBuyer
    LAST_NAME varchar(255) not null,
    FIRST_NAME varchar(255) not null,
    PATRONYMIC varchar(255) not null,
    --
    -- from onlineshop$LegalBuyer
    NAME varchar(255) not null,
    --
    primary key (ID)
);