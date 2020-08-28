use demo;
---- create ----
create table IF not exists account
(
    username varchar(100)   NOT NULL,
    password varchar(100)   NOT NULL,
    role     varchar(100)   NOT NULL,
    CONSTRAINT account_pk PRIMARY KEY (username)
);