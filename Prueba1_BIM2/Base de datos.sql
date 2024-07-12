create database Product_CuidadoPersonal;

use Product_CuidadoPersonal;

CREATE TABLE USUARIO (
 username VARCHAR(50) NOT NULL,
 password VARCHAR(50) NOT NULL
);

CREATE TABLE PRODUCTO (
 codigo_producto VARCHAR(20) PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL,
 descripcion TEXT,
 precio DECIMAL(10, 2) NOT NULL,
 cantidad INT NOT NULL,
 categoria VARCHAR(50)
);

select *from USUARIO;

INSERT INTO USUARIO(username, password) values 
("admin","admin");

select *from PRODUCTO;


