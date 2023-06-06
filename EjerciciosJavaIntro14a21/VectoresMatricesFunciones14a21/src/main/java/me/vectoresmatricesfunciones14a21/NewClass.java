/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package me.vectoresmatricesfunciones14a21;

/**
 *
 * @author idmig
 */
public class ejercicio21 {
    public static void main(String[] args) {
        int[][] matrizA = {{ 1,26,36,47, 5, 6,72,81,95,36},
                           {11,12,13,21,41,22,67,20,10,61},
                           {56,78,87,90, 9,90,17,12,87,67},
                           {41,87,24,56,97,74,87,42,64,35},
                           {32,76,79, 1,36, 5,67,96,12,11},
                           {99,13,54,88,89,90,75,12,41,76},
                           {67,78,87,45,14,22,26,42,56,78},
                           {98,45,34,23,32,56,74,36, 5,67},
                           {24,67,97,46,87,13,67,89,90,75},
                           {21,68,78,98,90,67,12,14,22,26}};

        int[][] matrizB = {{36, 5,67},
                           {89,90,75},
                           {14,22,26}};

        String posiciones = "";

        //llenarMatriz(matriz);
        System.out.println("La matriz 10x10 es:");
        mostrarMatriz(matrizA);
        System.out.println("La matriz 3x3 es:");
        mostrarMatriz(matrizB);

        posiciones = validarInclusion(matrizA,matrizB);

        if (!posiciones.isEmpty()) {
            System.out.println("Esta incluida.");
            System.out.println(posiciones);
        }else{
            System.out.println("No está incluida.");
        }
    }

    private static String validarInclusion(int[][] matrizA, int[][] matrizB) {
        String posiciones = "", posicionesFinal = "";
        boolean brakeL = false;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length ; j++) {
                if (matrizA[i][j] == matrizB[0][0]) {
                    for (int k = 0; k < matrizB.length; k++) {
                        if (brakeL) {
                            brakeL = false;
                            break;
                        }
                        for (int l = 0; l < matrizB[k].length; l++) {
                            if (i+2< matrizA.length && j+2< matrizA[0].length) {
                                if (matrizA[i+k][j+l] == matrizB[k][l]) {
                                    posiciones +="[" + (i+k) + "," + (j+l) + "] ";
                                }else{
                                    brakeL = true;
                                    posiciones = "";
                                    break;
                                }
                            } else {
                                brakeL = true;
                                break;
                            }
                        }
                    }
                    if(!posiciones.isEmpty() ) {
                        posicionesFinal += "Posiciones: " + (posiciones) + "\n";
                        posiciones = "";
                    }
                }
            }

        }
        return posicionesFinal;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]/10 < 1){
                    System.out.print("  " + matriz[i][j]);
                }else{
                System.out.print(" " + matriz[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = j;
            }
        }
    }
}