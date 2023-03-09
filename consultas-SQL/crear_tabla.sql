CREATE TABLE usuarios (
	id int(11) NOT NULL AUTO_INCREMENT,
    nombre varchar(80) NOT NULL,
    apellido varchar(80) NOT NULL,
    fecha_nacimiento datetime NULL,
    PRIMARY KEY (id)
);