/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.ejerciciosjavaintro6a9;

import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class EjerciciosJavaIntro6a9 {

    public static void main(String[] args) {
        int opt;
        String name;
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese por su nombre");
        name = scann.nextLine();
        System.out.println("Elija el ejercicio que desea realizar:"
                + "\n 1. Determinar si un número es para o impar"
                + "\n 2. Determinar si una frase es igual a ``eureka´´"
                + "\n 3. Determinar si una frase tiene exactemente 8 de lóngitud"
                + "\n 4. Determinar si la primera letra de una frase es la 'A'");

        switch (opt = scann.nextInt()) {
            case 1:
                parImpar(name);
                break;
            case 2:
                eureka(scann);
                break;
            case 3:
                largo8(scann);
            case 4:
                primeraLetra();
                break;
            default:
                throw new AssertionError();
        }

    }

    public static void parImpar(String name) {
        int num;
        Scanner scann = new Scanner(System.in);

        System.out.println("Ingrese por un número para determinar si es par o impar");

        num = scann.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par, " + name);
        } else {
            System.out.println("El número es impar, " + name);
        }

    }

    public static void eureka(Scanner scann) {
        String phrase;
        System.out.println("Ingrese una frase por favor");

        phrase = scann.next();

        if ("eureka".equals(phrase)) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public static void largo8(Scanner scann) {
        String phrase;
        System.out.println("Ingrese una frase de 8 de longitud por favor");

        phrase = scann.next();

        if (phrase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

    public static void primeraLetra() {
        Scanner scann = new Scanner(System.in);
        String phrase;
        System.out.println("Ingrese una frase que empiece por la letra A por favor");
        phrase = scann.nextLine();

        if (phrase.toUpperCase().charAt(0) == 'A') {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
