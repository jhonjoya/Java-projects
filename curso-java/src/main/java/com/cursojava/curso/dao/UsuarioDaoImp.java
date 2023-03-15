package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp  implements UsuarioDao{
      @PersistenceContext
      EntityManager entityManager;

      @Override
      public List<Usuario> getUsuarios() {
            String query = "FROM Usuario"; //Nombre de la clase directamente
            return entityManager.createQuery(query).getResultList();
      }
}
