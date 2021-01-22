-- Base de datos de prueba MySQL

-- Borra la BD colegio
drop database if exists colegio;

-- Crea la BD colegio
create database colegio;

use colegio;

create table cursos(
    id int primary key auto_increment,
    titulo varchar(20),
    profesor varchar(20),
    dia varchar(10),
    turno varchar(10)
);

create table alumnos(
    id int primary key auto_increment,
    nombre varchar(20) not null,
    apellido varchar(20) not null,
    edad int,
    curso int not null
);