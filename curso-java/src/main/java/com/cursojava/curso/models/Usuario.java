package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Entidad que hace referencia a la base de datos
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Usuario {
      @Id
      @Getter @Setter @Column(name = "id")
      private Long id;
      @Getter @Setter @Column(name = "nombre")
      private String nombre;
      @Getter @Setter @Column(name = "apellido")
      private String apellido;
      @Getter @Setter @Column(name = "email")
      private String email;
      @Getter @Setter @Column(name = "telefono")
      private String telefono;
      @Getter @Setter @Column(name = "password")
      private String password;

}
