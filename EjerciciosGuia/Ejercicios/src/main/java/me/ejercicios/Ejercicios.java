/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ejercicios;

import java.util.Scanner;

/**
 *
 * @author idmig
 * 
 * Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
public class Ejercicios {

        
    public static void main(String[] args) {
        int opt;       
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Por favor elija el ejercicio que desea realizar"
        + "\n 1. Comprobar si dos enteros son mayores a 25"
        + "\n 2. Imprimir el tipo de motor según la opciónn seleccionada");

        switch (opt = scann.nextInt()) {
            case 1:
                numMayor25();
                break;
            case 2:
                motor();
                break;
            default:
                throw new AssertionError();
        }
       
    }
    
    public static void numMayor25() {
        int n1, n2;
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número");
        n1 = scann.nextInt();
        System.out.println("Por favor ingrese el segundo número");
        n2 = scann.nextInt();

        if (n1 > 25 && n2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (n1 > 25 || n2 > 25) {
            System.out.println("Uno de los dos números es mayor a 25");
        } else {
            System.out.println("Ninguno de los dos números es mayor a 25");
        }
    }    
        
    public static void motor() {
        int motor;
        
         Scanner scann = new Scanner(System.in);
         
         System.out.println("¿Qué tipo de motor es? ingrese un valor entre 1 y 4");
         
         switch (motor= scann.nextInt()) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                throw new AssertionError();
        }
        
        
    }    
        

}

