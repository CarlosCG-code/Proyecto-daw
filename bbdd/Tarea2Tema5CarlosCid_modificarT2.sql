/* Ejercicio 1 Carlos Cid
Dadas las siguientes tablas:
● LIBRO (codigo, autor, titulo, editor, clase, prestado)
● USUARIO (secuencia, nombre, dirección, fecha_ingreso)
● CLASE (clave, tiempo_de_prestamo)
● PRESTAMO (codigo, secuencia, fecha_inicio)
Con las siguientes claves foráneas:
➢ Libro.clase -> CLASE
➢ Prestamo.codigo -> LIBRO
➢ Prestamo.secuencia -> USUARIO
Y las siguientes restricciones:
➢ Prestado debe tomar por defecto el valor 1
➢ fecha_ingreso es un campo obligatorio
Se pide:
a) Crear las tablas y determinar los tipos de datos.
*/
CREATE DATABASE [IF NOT EXISTS] biblioteca CHARSET utf8;
USE biblioteca;
CREATE TABLE libro(
codigo INT UNSIGNED AUTO_INCREMENT NOT NULL,
autor VARCHAR(50) NOT NULL,
titulo VARCHAR(50) NOT NULL,
editor VARCHAR(50) NOT NULL,
clase INT UNSIGNED,
prestado BOOLEAN NOT NULL DEFAULT 1,
CONSTRAINT pk_libro PRIMARY KEY (codigo),
CONSTRAINT fk_libro_clase FOREIGN KEY (clase) REFERENCES clase(clave)
ON DELETE SET NULL
ON UPDATE CASCADE
);
CREATE TABLE usuario(
    secuencia INT UNSIGNED AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    direccion VARCHAR(100) NOT NULL,
    fecha_ingreso DATE NOT NULL,
    CONSTRAINT pk_usuario PRIMARY KEY (secuencia)
);
CREATE TABLE clase(
    clave INT UNSIGNED AUTO_INCREMENT NOT NULL,
    tiempo_de_prestamo INT UNSIGNED NOT NULL,
    CONSTRAINT pk_clase PRIMARY KEY (clave)
);
CREATE TABLE prestamo(
    codigo INT UNSIGNED NOT NULL,
    secuencia INT UNSIGNED NOT NULL,
    fecha_inicio DATE NOT NULL,
    CONSTRAINT pk_prestamo PRIMARY KEY (codigo, secuencia, fecha_inicio),
    CONSTRAINT fk_prestamo_libro FOREIGN KEY (codigo) REFERENCES libro(codigo)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT fk_prestamo_usuario FOREIGN KEY (secuencia) REFERENCES usuario(secuencia)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

USE biblioteca;
-- 1. Añadir el campo sexo (un sólo carácter) a la tabla usuario
ALTER TABLE usuario ADD COLUMN sexo CHAR(1);
-- 2. Añadir un campo índice de tipo entero a la tabla libro
ALTER TABLE libro ADD COLUMN indice INT;
-- 3. Añadir la restricción de no valores nulos al campo nombre de la tabla usuario
ALTER TABLE usuario MODIFY COLUMN nombre VARCHAR(50) NOT NULL;
-- 4. Renombrar la tabla clase a clase_nueva
RENAME TABLE clase TO clase_nueva;
-- 5. Actualizar la clave foránea en libro para que apunte a clase_nueva
ALTER TABLE libro DROP FOREIGN KEY fk_libro_clase;
ALTER TABLE libro ADD CONSTRAINT fk_libro_clase FOREIGN KEY (clase) REFERENCES clase_nueva(clave)
ON DELETE SET NULL
ON UPDATE CASCADE;
-- 6. Añadir un campo cuantía en la tabla prestamo en la 1ª posición
ALTER TABLE prestamo ADD COLUMN cuantia INT FIRST;
-- 7. Añadir un campo planta en la tabla clase_nueva posicionado en la segunda columna
ALTER TABLE clase_nueva ADD COLUMN planta VARCHAR(50) AFTER clave;
-- 8. Eliminar la clave principal de la tabla usuario
ALTER TABLE usuario DROP PRIMARY KEY;
