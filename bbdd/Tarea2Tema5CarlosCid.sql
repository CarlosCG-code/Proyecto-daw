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
/* Ejercicio 2 Carlos Cid
La liga de fútbol de Extremadura quiere diseñar un sistema de gestión que les permita
almacenar la información de equipos, jugadores, partidos y estadísticas.
Se nos proporciona las siguientes tablas:
Realizar el diseño físico usando SQL.
*/
CREATE DATABASE [IF NOT EXISTS] liga CHARSET utf8;
USE liga;
CREATE TABLE equipo(
    nombre VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) DEFAULT NULL,
    conferencia VARCHAR(15) DEFAULT NULL,
    division VARCHAR(30) DEFAULT NULL,
    CONSTRAINT pk_equipo PRIMARY KEY (nombre)
);
CREATE TABLE jugador(
    codigo INT UNSIGNED AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(50) DEFAULT NULL,
    procedencia VARCHAR(50) DEFAULT NULL,
    altura VARCHAR(15) DEFAULT NULL,
    peso INT UNSIGNED DEFAULT NULL,
    posicion VARCHAR(15) DEFAULT NULL,
    nombre_equipo VARCHAR(50) DEFAULT NULL,
    CONSTRAINT pk_jugador PRIMARY KEY (codigo),
    CONSTRAINT fk_jugador_equipo FOREIGN KEY (nombre_equipo) REFERENCES equipo(nombre)
    ON DELETE SET NULL
    ON UPDATE CASCADE
);
CREATE TABLE partido(
    codigo INT UNSIGNED AUTO_INCREMENT NOT NULL,
    equipo_local VARCHAR(50) DEFAULT NULL,
    equipo_visitante VARCHAR(50) DEFAULT NULL,
    puntos_local INT DEFAULT NULL,
    puntos_visitante INT DEFAULT NULL,
    temporada VARCHAR(15) DEFAULT NULL,
    CONSTRAINT pk_partido PRIMARY KEY (codigo),
    CONSTRAINT fk_partido_local FOREIGN KEY (equipo_local) REFERENCES equipo(nombre)
    ON DELETE SET NULL
    ON UPDATE CASCADE,
    CONSTRAINT fk_partido_visitante FOREIGN KEY (equipo_visitante) REFERENCES equipo(nombre) 
    ON DELETE SET NULL
    ON UPDATE CASCADE
);
CREATE TABLE estadistica(
    temporada VARCHAR(15) NOT NULL,
    jugador INT UNSIGNED NOT NULL,
    puntos_por_partido DOUBLE DEFAULT NULL,
    asistencias_por_partido DOUBLE DEFAULT NULL,
    tapones_por_partido DOUBLE DEFAULT NULL,
    rebotes_por_partido DOUBLE DEFAULT NULL,
    CONSTRAINT pk_estadistica PRIMARY KEY (temporada, jugador),
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
/* Ejercicio 3 Carlos Cid
BASE DE DATOS COLECCIÓN PELICULAS 
Crear la base de datos COLECCIONPELICULAS con las siguientes tablas: 
● GENERO (Genero, Descripcion) 
● PELICULA (Codigo, Titulo, Director, Anio, Genero) 
● DIRECTOR (Nombre, LugarNacimiento, FechaNacimiento) 
● ACTOR (Nombre, LugarNacimiento, FechaNacimiento, Sexo, Edad) 
● ACTOR_PELICULA (Pelicula, Actor, Personaje)
*/
CREATE DATABASE [IF NOT EXISTS] coleccionpeliculas CHARSET utf8;
USE coleccionpeliculas;
CREATE TABLE genero(
    genero VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    CONSTRAINT pk_genero PRIMARY KEY (genero)
);
CREATE TABLE director(
    nombre VARCHAR(50) NOT NULL,
    lugar_nacimiento VARCHAR(100) DEFAULT NULL,
    fecha_nacimiento DATE DEFAULT NULL,
    CONSTRAINT pk_director PRIMARY KEY (nombre)
);
CREATE TABLE pelicula(
    codigo INT UNSIGNED AUTO_INCREMENT NOT NULL,
    titulo VARCHAR(100) NOT NULL,
    director VARCHAR(50) NOT NULL,
    año YEAR DEFAULT NULL,
    genero VARCHAR(50) DEFAULT NULL,
    CONSTRAINT pk_pelicula PRIMARY KEY (codigo),
    CONSTRAINT fk_pelicula_director FOREIGN KEY (director) REFERENCES director(nombre)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT fk_pelicula_genero FOREIGN KEY (genero) REFERENCES genero(genero)
    ON DELETE SET NULL
    ON UPDATE CASCADE
);
CREATE TABLE actor(
    nombre VARCHAR(50) NOT NULL,
    lugar_nacimiento VARCHAR(100) DEFAULT NULL,
    fecha_nacimiento DATE DEFAULT NULL,
    sexo ENUM('M','V') NOT NULL,
    edad INT UNSIGNED DEFAULT NULL,
    CONSTRAINT pk_actor PRIMARY KEY (nombre)
);
CREATE TABLE actor_pelicula(
    pelicula INT UNSIGNED NOT NULL,
    actor VARCHAR(50) NOT NULL,
    personaje VARCHAR(100) NOT NULL,
    CONSTRAINT pk_actor_pelicula PRIMARY KEY (pelicula, actor),
    CONSTRAINT fk_actor_pelicula_pelicula FOREIGN KEY (pelicula) REFERENCES pelicula(codigo)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    CONSTRAINT fk_actor_pelicula_actor FOREIGN KEY (actor) REFERENCES actor(nombre)
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
