CREATE DATABASE IF NOT EXISTS tarea1 CHARSET uft8;
USE tarea1;
CREATE TABLE departamentos (
  dpto_cod INT UNSIGNED AUTO_INCREMENT CHECK (dpto_cod <= 250),
  nombre_dpto VARCHAR(30) NOT NULL UNIQUE,
  jefe VARCHAR(10),
  presupuesto INT NOT NULL,
  CONSTRAINT pk_departamentos PRIMARY KEY (dpto_cod)
);
CREATE TABLE trabajos (
  trabajo_cod CHAR(5) PRIMARY KEY,
  nombre_trab VARCHAR(20) NOT NULL UNIQUE,
  salario DECIMAL(7,2) NOT NULL CHECK (salario <= 5000)
);
CREATE TABLE universidades (
  univ_cod CHAR(5) PRIMARY KEY,
  nombre_univ VARCHAR(25) NOT NULL,
  ciudad VARCHAR(20),
  cod_postal CHAR(5)
);
CREATE TABLE empleados (
  dni CHAR(10),
  nombre VARCHAR(20) NOT NULL,
  apellido1 VARCHAR(15) NOT NULL,
  apellido2 VARCHAR(15) NOT NULL,
  direcc VARCHAR(25),
  ciudad VARCHAR(20),
  cod_postal CHAR(5),
  sexo ENUM('H','M'),
  fecha_nac DATE,
  dpto_cod INT UNSIGNED,
  CONSTRAINT pk_empleados PRIMARY KEY (dni),
  CONSTRAINT fk_empleados_dpto FOREIGN KEY (dpto_cod) REFERENCES departamentos(dpto_cod)
  ON DELETE RESTRICT
);
CREATE TABLE historial_laboral (
  id INT UNSIGNED AUTO_INCREMENT,
  empleado_dni CHAR(10) NOT NULL,
  trabajo_cod CHAR(5) NOT NULL,
  fecha_inicio DATE NOT NULL,
  fecha_fin DATE,
  ciudad CHAR(20),
  cod_postal CHAR(5),
  CONSTRAINT pk_historial_laboral PRIMARY KEY (id),
  CONSTRAINT fk_historial_empleado FOREIGN KEY (empleado_dni) REFERENCES empleados(dni)
  ON DELETE CASCADE,
  CONSTRAINT fk_historial_trabajo FOREIGN KEY (trabajo_cod) REFERENCES trabajos(trabajo_cod)
  ON DELETE RESTRICT
);
CREATE TABLE estudios (
  id INT UNSIGNED AUTO_INCREMENT,
  empleado_dni CHAR(10) NOT NULL,
  univ_cod CHAR(5) NOT NULL,
  titulacion VARCHAR(30),
  especialidad VARCHAR(20),
  año INT,
  CONSTRAINT pk_estudios PRIMARY KEY (id),
  CONSTRAINT fk_estudios_empleado FOREIGN KEY (empleado_dni) REFERENCES empleados(dni)
  ON DELETE CASCADE,
  CONSTRAINT fk_estudios_universidad FOREIGN KEY (univ_cod) REFERENCES universidades(univ_cod)
  ON DELETE CASCADE
);

/*Modificaciones de la base de datos*/
-- Punto 1
ALTER TABLE universidades MODIFY ciudad VARCHAR(20) NOT NULL;
ALTER TABLE universidades MODIFY cod_postal CHAR(5) NOT NULL;
ALTER TABLE empleados MODIFY direcc VARCHAR(25) NOT NULL;
ALTER TABLE empleados MODIFY cod_postal CHAR(5) NOT NULL;
ALTER TABLE empleados MODIFY sexo ENUM('H', 'M') NOT NULL;
ALTER TABLE empleados MODIFY fecha_nac DATE NOT NULL;
ALTER TABLE empleados MODIFY dpto_cod INT UNSIGNED NOT NULL;
-- Punto 2
ALTER TABLE departamentos MODIFY presupuesto INT(8) ZEROFILL NOT NULL;
-- Punto 3
INSERT INTO departamentos VALUES (1, 'Contabilidad', 'Lopez', 50000), (2, 'Informatica', 'Garcia', 75000);

INSERT INTO trabajos VALUES ('TR001', 'Analista', 3500.00), ('TR002', 'Programador', 2800.00);

INSERT INTO universidades VALUES ('UV001', 'Universidad Ciencias', 'Madrid', '28040'), ('UV002', 'Universidad de Sevilla', 'Sevilla', '41004');

INSERT INTO empleados VALUES ('12345678A', 'Ana', 'Martínez', 'Ruiz', 'Calle Mayor 1', 'Madrid', '28001', 'M', '1990-05-15', 1), ('87654321B', 'Carlos', 'López', 'Gómez', 'Avenida Sol 22', 'Sevilla', '41001', 'H', '1985-11-30', 2);

INSERT INTO historial_laboral VALUES ('12345678A', 'TR001', '2015-01-10', '2018-06-30', 'Madrid', '28001'), ('87654321B', 'TR002', '2019-03-01', NULL, 'Sevilla', '41001');

INSERT INTO estudios VALUES ('12345678A', 'UV001', 'Ingeniería Informática', 'Sistemas', 2012), ('87654321B', 'UV002', 'ADE', 'Finanzas', 2010);
-- Punto 4
INSERT INTO departamentos VALUES ('Logística', '123456666a', 30000);
-- Punto 5
ALTER TABLE empleados MODIFY ciudad VARCHAR(20) NOT NULL;
-- Punto 6
ALTER TABLE empleados
  ADD COLUMN valoracion TINYINT UNSIGNED DEFAULT 5 CHECK (valoracion BETWEEN 1 AND 10);
-- Punto 7
INSERT INTO empleados VALUES ('11111111C', 'Laura', 'Sánchez', 'Pérez', 'Calle Luna 3', 'Valencia', '46001', 'M', '1995-08-20', 1);
-- Punto 8
ALTER TABLE departamentos MODIFY nombre_dpto VARCHAR(30) NOT NULL;
-- Punto 9
ALTER TABLE departamentos MODIFY direcc VARCHAR(25);
-- Punto 10
ALTER TABLE empleados ALTER COLUMN valoracion DROP DEFAULT;
-- Punto 11
ALTER TABLE empleados MODIFY fecha_nac CHAR(30);
-- Punto 12
ALTER TABLE empleados ADD COLUMN telefono CHAR(11);
-- Punto 13
ALTER TABLE empleados DROP PRIMARY KEY;
ALTER TABLE empleados ADD CONSTRAINT pk_empleados PRIMARY KEY (telefono);