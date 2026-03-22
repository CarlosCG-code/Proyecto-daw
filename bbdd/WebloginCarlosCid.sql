CREATE DATABASE IF NOT EXISTS PRACTICAS_EMPRESA CHARSET utf8;
USE PRACTICAS_EMPRESA;
CREATE TABLE ALUMNOS (
    DNI CHAR(9) NOT NULL,
    nombre VARCHAR(50),
    direccion VARCHAR(20),
    telefono VARCHAR(10),
    CONSTRAINT pk_alumnos PRIMARY KEY (DNI),
    CONSTRAINT chk_dni CHECK (DNI REGEXP '^[0-9]{8}[A-Z]$'),
    CONSTRAINT chk_telefono CHECK (telefono LIKE '927%')
);

CREATE TABLE EMPRESAS (
    CIF CHAR(10) NOT NULL,
    nombre VARCHAR(20),
    direccion VARCHAR(20) NOT NULL,
    sector ENUM('Informática','I+D','Electrónica'),
    CONSTRAINT pk_empresas PRIMARY KEY (CIF),
    CONSTRAINT chk_cif CHECK (CIF REGEXP '^[A-Z][0-9]{8}[A-Z]$'),
    CONSTRAINT uk_nombre UNIQUE (nombre)
);

CREATE TABLE PRACTICAS (
    DNI CHAR(9) NOT NULL,
    CIF CHAR(10) NOT NULL,
    fecha_inicio DATE,
    numHoras INT DEFAULT 0,
    CONSTRAINT pk_practicas PRIMARY KEY (DNI, CIF),
    CONSTRAINT fk_pra_alu FOREIGN KEY (DNI) REFERENCES ALUMNOS  (DNI),
    CONSTRAINT fk_pra_emp FOREIGN KEY (CIF) REFERENCES EMPRESAS (CIF)
);
--1
ALTER TABLE ALUMNOS RENAME TO ALUMNO;
ALTER TABLE EMPRESAS RENAME TO EMPRESA;
ALTER TABLE PRACTICAS RENAME TO PRACTICA;
--2
ALTER TABLE PRACTICA
    ADD CONSTRAINT chk_fecha_inicio
    CHECK (MONTH(fecha_inicio) BETWEEN 3 AND 4);
--3
INSERT INTO ALUMNO (DNI, nombre, direccion, telefono) VALUES
    ('12345678A', 'Pepe García', NULL, '927123456'),
    ('12345678B', 'Pablo Picapiedra', 'Lima, S/N', '927567891'),
    ('12345678C', 'Vilma', NULL, '927555123');
--4
INSERT INTO EMPRESA (CIF, nombre, direccion, sector) VALUES
    ('A12345678Z', 'Empresa1', 'C/ Mármol', 'Informática'),
    ('B12345678Y', 'Empresa2', 'C/ Mármol', 'Informática');
--5
INSERT INTO PRACTICA (DNI, CIF, fecha_inicio, numHoras) VALUES
    ('12345678A', 'A12345678Z', '2025-03-10', 120),
    ('12345678B', 'A12345678Z', '2025-04-01',  80),
    ('12345678C', 'B12345678Y', '2025-03-20', 200);
--6
UPDATE EMPRESA
    SET nombre = UPPER(nombre);
UPDATE ALUMNO
    SET nombre = UPPER(nombre);
--7
CREATE TABLE COPIALUMNO AS
    SELECT * FROM ALUMNO WHERE nombre LIKE 'P%';
--8
DELETE FROM ALUMNO
    WHERE nombre LIKE 'P%' AND direccion IS NULL;
--9
ALTER TABLE ALUMNO
    MODIFY direccion VARCHAR(20) NOT NULL;
--10
ALTER TABLE EMPRESA
    ADD COLUMN localidad VARCHAR(50) NOT NULL AFTER direccion;

--EJERCICIO 2: Eª WEBLOGIN
CREATE DATABASE IF NOT EXISTS weblogin CHARSET utf8;
USE weblogin;
CREATE TABLE tblUsuarios (
    idx INT NOT NULL AUTO_INCREMENT,
    usuario VARCHAR(20),
    nombre VARCHAR(20),
    sexo ENUM('H','M'),
    nivel TINYINT,
    email VARCHAR(50),
    telefono VARCHAR(20),
    marca VARCHAR(20),
    compania VARCHAR(20),
    saldo DECIMAL(7,2),
    activo BOOLEAN,
    CONSTRAINT pk_tblUsuarios PRIMARY KEY (idx)
);
--1
INSERT INTO tblUsuarios (usuario, nombre, sexo, nivel, email, telefono, marca, compania, saldo, activo) VALUES
    ('jgarcia', 'Juan García', 'H', 1, 'jgarcia@gmail.com', '611-111-111', 'Samsung', 'Movistar', 120.50, TRUE),
    ('Mlopez', 'María López', 'M', 2, 'mlopez@hotmail.com', '622-222-222', 'Samsung', 'Orange', 200.00, TRUE),
    ('pmartin', 'Pedro Martín', 'H', 0, 'pmartin@hotmail.com', '633-333-333', 'Apple', 'Vodafone', 50.75, FALSE),
    ('Anagomez', 'Ana Gómez', 'M', 2, 'anagomez@yahoo.com', '644-444-444', 'Huawei', 'Movistar', 310.00, TRUE),
    ('rperez', 'Roberto Pérez', 'H', 0, 'rperez@gmail.com', '655-555-555', 'Samsung', 'Orange', 0.00, FALSE),
    ('Lsanchez', 'Laura Sánchez', 'M', 1, 'lsanchez@hotmail.com', '666-666-666', 'Xiaomi', 'Vodafone', 75.30, TRUE),
    ('Ctorres', 'Carlos Torres', 'H', 2, 'ctorres@gmail.com', '677-777-777', 'Samsung', 'Movistar', 180.40, TRUE);
--2
UPDATE tblUsuarios SET saldo = saldo * 1.10 WHERE nivel = 2;
--3
CREATE TABLE tblUsuariosBackup AS
    SELECT idx, usuario, nivel, activo
    FROM tblUsuarios
    WHERE 1 = 0;
--4
INSERT INTO tblUsuariosBackup (idx, usuario, nivel, activo)
    SELECT idx, usuario, nivel, activo
    FROM tblUsuarios
    WHERE nivel = 0;
--5
UPDATE tblUsuarios
    SET nombre = UPPER(nombre);
--6
DELETE FROM tblUsuariosBackup
    WHERE usuario NOT REGEXP '^[A-Z]';
--7
UPDATE tblUsuarios
    SET telefono = 'xxx-xxx-xxxx'
    WHERE email LIKE '%@hotmail.%'
    AND marca = 'Samsung';
--8
ALTER TABLE tblUsuarios
    ADD COLUMN fecha_nacimiento DATE DEFAULT '2006-01-01';
--9
DELETE FROM tblUsuarios
    WHERE sexo = 'M';
--10
DELETE FROM tblUsuarios
    WHERE email LIKE '%@gmail.%'
    AND LENGTH(nombre) > 4;

