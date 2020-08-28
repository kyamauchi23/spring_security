---- create ----
create table IF not exists account
(
  username varchar NOT NULL,
  password varchar NOT NULL,
  role varchar NOT NULL,
  CONSTRAINT account_pk PRIMARY KEY (username)
);