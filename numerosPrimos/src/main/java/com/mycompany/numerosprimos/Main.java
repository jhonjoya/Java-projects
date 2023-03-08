/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosprimos;

/**
 *
 * @author Jhon
 */
public class Main {

    public static void main(String[] args) {
        
        System.out.println("1");
        System.out.println("2");
        int contador = 2;
        int numero = 3;
        
        while (contador < 100) {
            Boolean noEsPrimo = false;
            for (int i = 2; i < numero; i++) {
                noEsPrimo = (numero % i) == 0;
                if (noEsPrimo) {
                    i = numero;
                }
            }
            if (!noEsPrimo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}
