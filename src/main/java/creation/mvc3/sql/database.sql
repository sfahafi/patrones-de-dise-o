drop database if exists mvc;
create database mvc;
use mvc;

create table persona(
    id int not null,
    nombre varchar(30),
    edad int,
    profesion varchar(30),
    telefono double,
    primary key (id)
);

