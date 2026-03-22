--Creacion de la base de datos
DROP DATABASE IF EXISTS instituto; 
CREATE DATABASE instituto CHARACTER SET utf8mb4; 
USE instituto; 
CREATE TABLE alumno ( 
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
    nombre VARCHAR(100) NOT NULL, 
    apellido1 VARCHAR(100) NOT NULL, 
    apellido2 VARCHAR(100), 
    fecha_nacimiento DATE NOT NULL, 
    es_repetidor ENUM('sí', 'no') NOT NULL, 
    telefono VARCHAR(9) 
);
--Insertamos los datos en la base de datos
INSERT INTO alumno VALUES(1, 'María', 'Sánchez', 'Pérez', '1990-12-01', 'no',NULL), 
(2, 'Juan', 'Sáez', 'Vega', '1998-04-02', 'no',618253876), 
(3, 'Pepe', 'Ramírez', 'Gea', '1988-01-03', 'no', NULL), 
(4, 'Lucía', 'Sánchez', 'Ortega', '1993-06-13', 'sí',678516294), 
(5, 'Paco', 'Martínez', 'López', '1995-11-24', 'no',692735409), 
(6, 'Irene', 'Gutiérrez', 'Sánchez', '1991-03-28', 'sí', NULL), 
(7, 'Cristina', 'Fernández', 'Ramírez', '1996-09-17','no', 628349590), 
(8, 'Antonio', 'Carretero', 'Ortega', '1994-05-20', 'sí', 612345633), 
(9, 'Manuel', 'Domínguez', 'Hernández', '1999-07-08','no', NULL), 
(10, 'Daniel', 'Moreno', 'Ruiz', '1998-02-03', 'no',NULL);
--1
USE instituto;
SELECT LOWER(CONCAT_WS(nombre, apellido1, apellido2)) FROM alumno;
--2
USE instituto;
SELECT UPPER(CONCAT_WS(nombre, apellido1, apellido2)) FROM alumno;
--3
USE instituto;
SELECT CONCAT_WS(nombre, apellido1, apellido2) AS alumnos IF(apellido2 = NULL, alumnos = CONCAT_WS(nombre, apellido1), alumnos = CONCAT_WS(nombre, apellido1, apellido2)) FROM alumno;
--4
USE instituto;
SELECT nombre, apellido1, apellido2 FROM alumno ORDER BY apellido1 ASC;
--5
USE instituto;
SELECT nombre FROM alumno WHERE apellido1 LIKE "Martínez";
--6
USE instituto;
SELECT nombre, fecha_nacimiento FROM alumno WHERE fecha_nacimiento > "1997-1-1";
--7
USE instituto;
SELECT * FROM alumno WHERE id = 1;
--8
USE instituto;
SELECT * FROM alumno WHERE telefono = "692735409";
--9
USE instituto;
SELECT * FROM alumno WHERE es_repetidor = "sí";
--10
USE instituto;
SELECT * FROM alumno WHERE es_repetidor = "no";
--11
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento < "1993-1-1";
--12
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento > "1994-1-1";
--13
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento > "1994-1-1" AND es_repetidor = "no";
--14
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento BETWEEN "1998-1-1" AND "1998-12-31";
--15
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento NOT BETWEEN "1998-1-1" AND "1998-12-31";
--16
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento BETWEEN "1998-1-1" AND "1998-5-31";
--17
USE instituto;
SELECT * FROM alumno WHERE fecha_nacimiento NOT BETWEEN "1998-1-1" AND "1998-5-31";
--18
USE instituto;
SELECT nombre AS nombre_original, REVERSE(nombre) AS nombre_invertido FROM alumno;
--19
USE instituto;
SELECT CONCAT_WS(' ', nombre, apellido1, apellido2) AS nombre_completo, REVERSE(CONCAT_WS(' ', nombre, apellido1, apellido2)) AS nombre_completo_invertido FROM alumno;
--20
USE instituto;
SELECT UPPER(CONCAT_WS(' ', nombre, apellido1, apellido2)) AS nombre_completo_mayuscula, LOWER(REVERSE(CONCAT_WS(' ', nombre, apellido1, apellido2))) AS nombre_completo_invertido_minuscula FROM alumno;
--21
USE instituto;
SELECT CONCAT_WS(' ', nombre, apellido1, apellido2) AS nombre_completo, CHAR_LENGTH(CONCAT_WS(' ', nombre, apellido1, apellido2)) AS num_caracteres, OCTET_LENGTH(CONCAT_WS(' ', nombre, apellido1, apellido2)) AS num_bytes FROM alumno;
--22
USE instituto;
SELECT CONCAT_WS(' ', nombre, apellido1, apellido2) AS nombre_completo, LOWER(CONCAT(nombre, '.', apellido1, '@iesagora.es')) AS correo FROM alumno;
--23
USE instituto;
SELECT fecha_nacimiento, DAY(fecha_nacimiento) AS dia, MONTH(fecha_nacimiento) AS mes, YEAR(fecha_nacimiento) AS año FROM alumno;
--24
USE instituto;
SELECT fecha_nacimiento, DAYNAME(fecha_nacimiento) AS nombre_dia_semana, MONTHNAME(fecha_nacimiento) AS nombre_mes FROM alumno;
--24b
USE instituto;
SELECT fecha_nacimiento, DATE_FORMAT(fecha_nacimiento, '%W') AS nombre_dia_semana, DATE_FORMAT(fecha_nacimiento, '%M') AS nombre_mes FROM alumno;

--25
USE instituto;
SELECT fecha_nacimiento, DATEDIFF(NOW(), fecha_nacimiento) AS dias_desde_nacimiento FROM alumno;