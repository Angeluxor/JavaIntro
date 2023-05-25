/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.ejercicios;

import java.util.Scanner;


/**
 *
 * @author idmig
 * 
 */
public class Ejercicios {

        
    public static void main(String[] args) {
        int opt;       
        
        Scanner scann = new Scanner(System.in);
        
        System.out.println("Por favor elija el ejercicio que desea realizar"
        + "\n 1. Comprobar si dos enteros son mayores a 25"
        + "\n 2. Imprimir el tipo de motor según la opciónn seleccionada"
        + "\n 3. Pedir una nota y comprobar que sea válida"
        + "\n 4. Pedir 20 números enteros y sumarlos mientras se cumplan ciertas condiciones"
        + "\n 5. Leer 4 números e imprimir tantos asteriscos como indique el valor de cada uno"
        + "\n 6. Codificar una frase");

        switch (opt = scann.nextInt()) {
            case 1:
                numMayor25();
                break;
            case 2:
                motor();
                break;
            case 3:
                notas();
                break;
            case 4:
                leer20();
                break;
            case 5:
                numAsteriscos();
                break;
            case 6:
                scann.nextLine();
                System.out.println("Por favor ingrese la frase que desea codificar");
                String phrase = scann.nextLine();
                System.out.println("La frase codificada es: \n" + maquinaEnigma(phrase));
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

    public static void notas() {
        int nota = 0;
        Scanner scann = new Scanner(System.in);

        while (nota < 0 || nota >= 10) {
            System.out.println("Por favor ingrese una nota entre 0 y 10");
            nota = scann.nextInt();
        }
        System.out.println("Nota ingresada de manera correcta");
    }
    
    public static void leer20() {
        int n, suma = 0, i = 0;
        Scanner scann = new Scanner(System.in);
        do {
            System.out.println("Por favor ingrese un número positivo");
            n = scann.nextInt();
            i++;
            if (n < 0) {
                System.out.println(n + "No es un número positivo y no se sumará");
                continue;
            }
            suma = suma + n;
        } while (n != 0 && i < 20);
        if (n == 0) {
            System.out.println("Se capturó el número 0 y la suma de los números válidos ingresados es " + suma);
        } else {
            System.out.println("Se han ingresado 20 números y la suma de los números válidos ingresados es " + suma);
        }
    }
    
    public static void numAsteriscos(){
        int n1=0, n2=0, n3=0, n4=0;
        String stg = "*";
                
        Scanner scann = new Scanner(System.in);
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Por favor ingrese el " + i + "º valor");
            switch (i) {
                case 1:
                    n1 = scann.nextInt();
                    break;
                case 2:
                    n2 = scann.nextInt();
                    break;
                case 3:
                    n3 = scann.nextInt();
                    break;
                case 4:
                    n4 = scann.nextInt();
                    break;    
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Los valores ingresados son:");
        
       for (int i = 1; i <= 4; i++) {            
            switch (i) {
                case 1:
                    System.out.print(n1 + " ");
                    for (int j = 0; j < n1; j++) {
                        System.out.print("*");
                    }
                        System.out.println("");
                    break;
                case 2:
                    System.out.print(n2 + " ");
                    for (int j = 0; j < n2; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.print(n3 + " ");
                    for (int j = 0; j < n3; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.print(n4 + " ");
                    for (int j = 0; j < n4; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                    break;    
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    public static String maquinaEnigma(String phrase){
        String codedPhrase = "";
        phrase = phrase.toLowerCase();
        
        for (int i = 0; i < phrase.length(); i++) {
            switch (phrase.charAt(i)) {
                case 'a':
                    codedPhrase = codedPhrase.concat("@");
                    break;
                case 'e':
                    codedPhrase = codedPhrase.concat("#");
                    break;
                case 'i':
                    codedPhrase = codedPhrase.concat("$");
                    break;
                case 'o':
                    codedPhrase = codedPhrase.concat("%");
                    break;
                case 'u':
                    codedPhrase = codedPhrase.concat("*");
                    break;
                default:
                    codedPhrase = codedPhrase.concat(phrase.substring(i,i+1));
            }
        }
        return codedPhrase;
        
    }

}

