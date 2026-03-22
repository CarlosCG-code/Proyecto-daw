DROP DATABASE IF NOT EXISTS BIBLIO;
CREATE DATABASE IF NOT EXISTS BIBLIO CHARSET utf8 COLLATE latin1_spanish_ci;
USE BIBLIO;
CREATE TABLE socio (
    nsocio INT(4) UNSIGNED ZEROFILL,
    apellido VARCHAR(14) NOT NULL,
    telefono VARCHAR(9) NOT NULL,
    falta DATE DEFAULT 2015-1-1 NOT NULL,
    direccion VARCHAR(20),
    codpostal CHAR(5) NOT NULL,
    CONSTRAINT pk_socio PRIMARY KEY (nsocio)
);
--3
ALTER TABLE socio
    MODIFY telefono CHAR(9) NOT NULL;
--4
CREATE TABLE PRESTAMOS (
    numero_prestamo CHAR(3),
    codigo_socio CHAR(4),
    CONSTRAINT fk_prestamos_socio FOREIGN KEY (codigo_socio) REFERENCES socio(nsocio)
);
--5
ALTER TABLE PRESTAMOS
    ADD PRIMARY KEY (numero_prestamo);
--6
ALTER TABLE socio
    ADD direccion_correo VARCHAR(20) AFTER telefono;
--7
ALTER TABLE socio
    MODIFY direccion_correo VARCHAR(20) NOT NULL;
--8
ALTER TABLE socio
    ADD UNIQUE (telefono);
--9
ALTER TABLE socio
    DROP COLUMN fecha_alta;
--10
ALTER TABLE socio
    DROP CONSTRAINT pk_socio;
--11
ALTER TABLE socio
    MODIFY direccion VARCHAR(20) NOT NULL;
--12
ALTER TABLE socio
    ADD fecha_alta DATE NOT NULL DEFAULT 2015-01-01;
--13
ALTER TABLE socio
    MODIFY apellidos VARCHAR(20) NOT NULL;
    RENAME COLUMN apellidos TO apellidosS;
--14
RENAME TABLE PRESTAMOS TO PRESTAMOS1a;
--15
ALTER TABLE socio
    ADD COLUMN sexo ENUM('HOMBRE','MUJER') ;