/*
SCHEMA FROM SPRING SECURITY:
https://github.com/spring-projects/spring-security/blob/main/core/src/main/resources/org/springframework/security/core/userdetails/jdbc/users.ddl

create table users(
                      username varchar(50) not null primary key,
                      password varchar(500) not null,
                      enabled boolean not null
);

create table authorities (
                             username varchar(50) not null,
                             authority varchar(50) not null,
                             constraint fk_authorities_users foreign key(username) references users(username)
);

create unique index ix_auth_username on authorities (
                                                     username,
                                                     authority);
*/

create table customers(
                          id    bigserial primary key,
                          email varchar(70)  not null,
                          pwd   varchar(500) not null
);

create table roles(
                      id  bigserial primary key,
                      role_name varchar(50),
                      description varchar(100),
                      id_customer bigint,
                      constraint fk_customer foreign key(id_customer) references customers(id)
);