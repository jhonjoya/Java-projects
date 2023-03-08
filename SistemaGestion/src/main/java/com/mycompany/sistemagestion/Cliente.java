/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion;

/**
 *
 * @author Jhon
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
   
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    
    public void setApellido(String valor){
        apellido = valor;
    }
}
