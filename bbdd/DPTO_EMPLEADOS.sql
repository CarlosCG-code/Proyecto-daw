CREATE DATABASE IF NOT EXISTS DPTO_EMPLEADOS CHARSET uftf8;
USE DPTO_EMPLEADOS;
CREATE TABLE empleados(
    codigo INT UNSIGNED AUTO_INCREMENT,
    dni VARCHAR(9) UNIQUE,
    nombre VARCHAR(50),
    hijos INT UNSIGNED,
    retencion INT UNSIGNED,
    CUENTA INT UNSIGNED UNIQUE,
    fnacimiento DATE,
    CONSTRAINT pk_empleados PRIMARY KEY (codigo)
);
CREATE TABLE departamentos(
    telefono VARCHAR(9),
    nombredpto VARCHAR(15),
    dni_jefe VARCHAR(9),
    edificio VARCHAR(1),
    CONSTRAINT pk_departamentos PRIMARY KEY (telefono)
    CONSTRAINT chk_edificio CHECK (edificio IN ("A","B","C"))
);
ALTER TABLE departamentos
RENAME COLUMN nombredpto TO Nombre_Dpto