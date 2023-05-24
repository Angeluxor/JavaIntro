/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ejerciciosjavaintro1a5;

import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class EjerciciosJavaIntro1a5 {

    public static void main(String[] args) {
        int opt;
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Elija el ejercicio que quiere realizar:"
                + "\n 1. Sumar dos números"
                + "\n 2. Leer e imprimir nombre"
                + "\n 3. Leer una frase y pasarla a mayúsculas y minúsculas"
                + "\n 4. Convertir grados centígrados a Fahrenheit"
                + "\n 5. Obtener el doble, el triple y la raíz cuadrada de un número");
        
        switch (opt = scann.nextInt()) {
            case 1:
                suma();
                break;
            case 2:
                nombre();
                break;
            case 3:
                frase();
                break;
            case 4:
                centigradosA25Fahrenheit();
                break;
            case 5:
                numero();
                break;
            default:
                throw new AssertionError();
        }

       
                
    }
    
    public static void numero(){
        int num, doble, triple;
        double raiz;
        Scanner scann = new Scanner(System.in);        
        System.out.println("Por favor ingrese el número que desea operar");
        num = scann.nextInt();        
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        System.out.println("Para el número " + num + " el doble es: " + doble + " el triple es: " + triple + " y la raíz cuadrada es: " + raiz);     
    }
    
     public static void centigradosA25Fahrenheit(){
        double centigrados, fahrenheit;
        Scanner scann = new Scanner(System.in);        
        System.out.println("Por favor ingrese la cantidad de grados centigrados que desea convertir a Fahrenheit");
        centigrados = scann.nextDouble();        
        fahrenheit = 32 + (9*centigrados/5);        
        System.out.println(centigrados + "ºC equivalen a " + fahrenheit + "ºF");
    }
    
    public static void frase(){
        String phrase;
        Scanner scann = new Scanner(System.in);        
        System.out.println("Por favor ingrese una frase");
        phrase = scann.nextLine();
        System.out.println("\n La frase en mayúsculas es " + phrase.toUpperCase());
        System.out.println("La frase en minúsculas es " + phrase.toLowerCase());
    } 
    
    public static void nombre(){
        String name;
        Scanner scann = new Scanner(System.in);        
        System.out.println("Por favor ingrese su nombre");
        name = scann.nextLine();
        System.out.println("Bienvenido " + name);
    } 
    
    public static void suma(){
        int n1, n2, suma;
        Scanner scann = new Scanner(System.in);        
        System.out.println("Por favor ingrese el primer número a sumar");
        n1 = scann.nextInt();
        System.out.println("Por favor ingrese el segundo número a sumar");
        n2 = scann.nextInt();
        suma = n1 + n2;        
        System.out.println("La suma de " + n1 + " + " + n2 + " es: " + suma);
    }
}
