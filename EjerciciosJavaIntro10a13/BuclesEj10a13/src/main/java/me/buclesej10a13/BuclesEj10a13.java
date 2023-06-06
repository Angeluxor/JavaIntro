/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.buclesej10a13;

import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class BuclesEj10a13 {

    public static void main(String[] args) {
        int opt;

        Scanner scann = new Scanner(System.in);

        System.out.println("Por favor elija el ejercicio que desea realizar"
                + "\n 1. Ingresar un límite y sumar números hasta superarlo"
                + "\n 2. Calculadora básica"
                + "\n 3. RS232"
                + "\n 4. Dibujar cuadrado");

        switch (opt = scann.nextInt()) {
            case 1:
                limiteSuma();
                break;
            case 2:
                calculadoraBasica();
                break;
            case 3:
                rs232();
                break;
            case 4:
                cuadroAsteriscos();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public static void limiteSuma() {
        int lim, sum = 0;

        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese un límite positivo");
        lim = scann.nextInt();

        do {
            System.out.println("Por favor ingrese un número entero");
            sum = sum + scann.nextInt();
        } while (sum <= lim);

        System.out.println("Con un total de " + sum + " se ha superado el límite establecido de " + lim);
    }

    public static void calculadoraBasica() {
        int n1, n2, opt;
        boolean exit = false;
        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese un número positivo");
        n1 = scann.nextInt();
        System.out.println("Ingrese un segundo número positivo");
        n2 = scann.nextInt();

        do {

            System.out.println("\nMENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija una opción:");

            switch (opt = scann.nextInt()) {
                case 1:
                    System.out.println("El resultado de sumar " + n1 + " + " + n2 + " es " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("El resultado de restar " + n1 + " - " + n2 + " es " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("El resultado de multiplicar " + n1 + " x " + n2 + " es " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("El resultado de dividir " + n1 + " / " + n2 + " es " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    scann.nextLine();
                    if (scann.nextLine().equalsIgnoreCase("S")) {
                        exit = true;
                        break;
                    } else {
                        break;
                    }
                default:
                    System.out.println("Opción inválida");
                    break;
            }

        } while (!exit);

    }

    public static void rs232() {
        String fde = "&&&&&", input;
        int lecturasCorrectas = 0, lecturasIncorrectas = 0;
        Scanner scann = new Scanner(System.in);
        do {
            System.out.println("Por favor ingrese la cadena a evaluar");
            input = scann.next();
            input = input.toUpperCase();

            if (input.equals(fde)) {
                continue;
            }

            if (input.startsWith("X") && input.endsWith("O") && input.length() <= 5) {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }

        } while (!input.equals(fde));

        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);

    }

    public static void cuadroAsteriscos() {
        int lado;

        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del cuadrado que desea dibujar");
        lado = scann.nextInt();

        for (int i = 0; i < lado; i++) {
            System.out.println("");
            for (int j = 0; j < lado; j++) {
                if (j == 0 || j == lado - 1 || i == 0 || i == lado - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

        }

    }
}
