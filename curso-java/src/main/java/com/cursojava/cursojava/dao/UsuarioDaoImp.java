package com.cursojava.cursojava.dao;

import com.cursojava.cursojava.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional

public class UsuarioDaoImp  implements UsuarioDao{

      @Override
      public List<Usuario> getUsuarios() {
            return null;
      }
}
