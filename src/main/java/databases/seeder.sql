drop database if exists adlister_db;

create database adlister_db;

use adlister_db;

create table users
(
    id           int unsigned not null auto_increment primary key,
    first_name   varchar(50),
    last_name    varchar(50),
    phone_number varchar(30)
);