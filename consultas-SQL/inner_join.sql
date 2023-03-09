SELECT p.id, p.titulo, p.texto,
CONCAT(u.nombre, ' ', u.apellido) as 'autor'
FROM publicaciones p INNER JOIN usuarios u
ON p.autor_id = u.id;