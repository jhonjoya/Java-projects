/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jhon
 */
public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Ingrese el primer número: ");
        Integer number1 = cargarNumero();
        System.out.println("Ingrese el segundo número: ");
        Integer number2 = cargarNumero();
        System.out.println("Ingrese el tercer número: ");
        Integer number3 = cargarNumero();

        calcularNumero(number1, number2, number3);
        calcularNumeroMayor(number1, number2, number3);
        calcularNumeroMenor(number1, number2, number3);
        
        promedioNumeros(number1, number2, number3);
        
        parOImpar(number1);
        
    }

    /**
     *
     * @return @throws IOException
     */
    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in); //captura como elemento de entrada el teclado
        BufferedReader buffer = new BufferedReader(capturarTeclado); //Comienza almacenar "buffer" lo que ingresa desde el teclado

        String strNumber = buffer.readLine();
        Integer number = Integer.valueOf(strNumber);

        return number;
    }

    /**
     * Esta función sirve para mostrar el cálculo de números
     *
     * @param number1 es el primer número
     * @param number2 es el segundo número
     * @param number3 es el tercer número
     */
    private static void calcularNumero(int number1, int number2, int number3) {
        if (number1 >= number2) {
            if (number1 >= number3) {
                System.out.println("El número " + number1 + " es el mayor.");
                if (number2 >= number3) {
                    System.out.println("El número " + number3 + " es el menor.");
                } else {
                    System.out.println("El número " + number2 + " es el menor.");
                }
            } else {
                System.out.println("El número " + number3 + " es el mayor.");
                System.out.println("El número " + number2 + " es el menor.");

            }
        } else {
            if (number2 >= number3) {
                System.out.println("El número " + number2 + " es el mayor.");
                if (number3 >= number1) {
                    System.out.println("El número " + number1 + " es el menor.");
                } else {
                    System.out.println("El número " + number3 + " es el menor.");
                }
            } else {
                System.out.println("El número " + number3 + " es el mayor.");
                System.out.println("El número " + number1 + " es el menor.");
            }
        }
    }

    private static void calcularNumeroMayor(int number1, int number2, int number3) {
        if (number1 >= number2) {
            if (number1 >= number3) {
                System.out.println("El número " + number1 + " es el número mayor");
            } else {
                System.out.println("El número " + number3 + " es el número mayor");
            }
        } else {
            if (number2 >= number3) {
                System.out.println("El número " + number2 + " es el número mayor");
            } else {
                System.out.println("El número " + number3 + " es el número mayor");
            }
        }
    }

    private static void calcularNumeroMenor(int number1, int number2, int number3) {
        if (number1 < number2) {
            if (number1 < number3) {
                System.out.println("El número " + number1 + " es el número menor");
            } else {
                System.out.println("El número " + number3 + " es el número menor");
            }
        } else {
            if (number2 < number3) {
                System.out.println("El número " + number2 + " es el número menor");
            } else {
                System.out.println("El número " + number3 + " es el número menor");
            }
        }
    }

    private static void promedioNumeros(int number1, int number2, int number3) {
        Double numeroPromedio = Double.valueOf(number1 + number2 + number3) / 3;
        System.out.println("El promedio de los números es: " + numeroPromedio );
    }
    
    private static void parOImpar(int number){
        Boolean esPar = (number % 2) == 0;
        
        if (esPar) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

}
