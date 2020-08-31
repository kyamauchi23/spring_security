use demo;
---- create ----
create table IF not exists users
(
    id varchar(100)   NOT NULL,
    name varchar(100)   NOT NULL,
    email varchar(100)   NOT NULL,
    password varchar(100)   NOT NULL,
    role     varchar(100)   NOT NULL,
    enabled boolean NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (id)
);