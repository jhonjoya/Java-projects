package com.cursojava.cursojava.controllers;

import com.cursojava.cursojava.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario1 = new Usuario();
        usuario1.setId(134L);
        usuario1.setNombre("Lucas");
        usuario1.setApellido("Moy");
        usuario1.setEmail("lucasmoy@hotmail.com");
        usuario1.setTelefono("234234234");

        Usuario usuario2 = new Usuario();
        usuario2.setId(345L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzalez");
        usuario2.setEmail("maria.gon@hotmail.com");
        usuario2.setTelefono("364738272");

        Usuario usuario3 = new Usuario();
        usuario3.setId(11L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Alaiga");
        usuario3.setEmail("alaiga124@hotmail.com");
        usuario3.setTelefono("345377434");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario123")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");

        return usuario;
    }

    @RequestMapping(value = "usuario34")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");

        return usuario;
    }

    @RequestMapping(value = "usuario45")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("234234234");

        return usuario;
    }

}
