CREATE TABLE publicaciones (
	id int(11) NOT NULL AUTO_INCREMENT,
    autor_id int(11) NOT NULL,
    titulo varchar(150) NOT NULL,
    texto text NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (autor_id) REFERENCES usuarios(id)
);