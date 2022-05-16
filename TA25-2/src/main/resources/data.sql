DROP TABLE IF EXISTS departamentos;
CREATE TABLE departamentos(codigo INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(60),
presupuesto INT
);

DROP TABLE IF EXISTS empleados;
CREATE TABLE empleados(dni VARCHAR(8) NOT NULL PRIMARY KEY,
nombre NVARCHAR(100),
apellidos NVARCHAR(255),
codigo INT NOT NULL,
CONSTRAINT `codigo` FOREIGN KEY (`codigo`) REFERENCES `departamentos` (`codigo`)
);