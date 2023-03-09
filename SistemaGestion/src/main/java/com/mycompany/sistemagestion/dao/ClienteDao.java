/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion.dao;

/**
 *
 * @author Jhon
 */
public class ClienteDao {

        public void conectar() {
                String baseDeDatos = "java";
                String usuario = "root";
                String password = "";
                String host = "localhost";
                String puerto = "3306";
                String driver = "com.mysql.jdbc.Driver";
                String conexionurl = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";
        }
}
