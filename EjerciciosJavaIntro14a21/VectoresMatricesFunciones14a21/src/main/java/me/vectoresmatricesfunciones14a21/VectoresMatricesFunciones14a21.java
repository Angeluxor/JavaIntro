/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.vectoresmatricesfunciones14a21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author idmig
 */
public class VectoresMatricesFunciones14a21 {

    public static void main(String[] args) {
        int opt;

        Scanner scann = new Scanner(System.in);

        System.out.println("Por favor elija el ejercicio que desea realizar"
                + "\n 1. Convertir una cantidad determinada de euros a otra moneda"
                + "\n 2. Rellenar un vector con 100 números y mostrarlos en orden descendente"
                + "\n 3. Generar un vector aleatorio y realizar la búsqueda de un elemento en él"
                + "\n 4. Recorrer un vector y clasificar su contenido según el número de dígitos"
                + "\n 5. Generar una matriz aleatoria de 4x4 y mostrarm su traspuesta"
                + "\n 6. Evaluar matriz antisimétrica"
                + "\n 7. Evaluar cuadrado mágico"
                + "\n 8. Buscar una matriz de 3x3 en una matriz de 10x10" );

        switch (opt = scann.nextInt()) {
            case 1:
                System.out.println("Por favor ingrese la cantidad de euros que desea convertir a otra moneda");
                double euros = scann.nextDouble();
                System.out.println("Por favor indique a qué moneda desea realizar la conversión"
                        + "\n Ingrese:"
                        + "\n Y para yenes"
                        + "\n D para dólares"
                        + "\n L para libras");
                scann.nextLine();
                String moneda = scann.nextLine();
                conversorMoneda(euros, moneda);
                break;
            case 2:
                vector100();
                break;
            case 3:
                vectorN();
                break;
            case 4:
                vectorDigitos();
                break;
            case 5:
                matrizTraspuesta();
                break;
            case 6:
                matrizAntisimetrica();
                break;
            case 7:
                cuadradoMagico();
                break;
            case 8:
                matrizEnMatriz();
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    public static void conversorMoneda(double cantEuros, String moneda) {
        moneda = moneda.toLowerCase();

        switch (moneda) {
            case "y":
                System.out.println(cantEuros + " euros equivalen a " + (cantEuros * 129.852) + " yenes");
                break;
            case "d":
                System.out.println(cantEuros + " euros equivalen a " + (cantEuros * 1.28611) + " dólares");
                break;
            case "l":
                System.out.println(cantEuros + " euros equivalen a " + (cantEuros * 0.86) + " libras");
                break;
            default:
                System.out.println("Opción inválida");
                ;
        }

    }

    public static void vector100() {
        int[] vector100 = new int[100];

        for (int i = 0; i < 100; i++) {
            vector100[i] = i;
        }

        for (int j = 99; j >= 0; j--) {
            System.out.println(vector100[j]);

        }
    }

    public static void vectorN() {
        int finded = 0;
        int[] vector = vectorAleatorio(11);
        Scanner scann = new Scanner(System.in);
        System.out.println("¿Qué número desea buscar?");
        int numBuscado = scann.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numBuscado) {
                System.out.println("Número " + numBuscado + " encontrado en la posición " + i);
                finded++;
            }
        }

        switch (finded) {
            case 0:
                System.out.println("El número no se encontró en el arreglo");
                break;
            case 1:
                System.out.println("El número no está repetido");
                break;
            default:
                System.out.println("El número se repite un total de " + finded + " veces");
                break;
        }
    }

    private static int[] vectorAleatorio(int max) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Por favor ingrese el tamaño del vector que desea llenar de manera aletoria");
        int size = scann.nextInt();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            vector[i] = (int) (random.nextInt(max) / Math.pow(10, (Math.random() * 5)));
        }
        System.out.println("Vector llenado con éxito");
        return vector;
    }

    private static void vectorDigitos() {
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        int[] vector = vectorAleatorio(100001);

        for (int i = 0; i < vector.length; i++) {
            switch (String.valueOf(vector[i]).length()) {
                case 1:
                    d1++;
                    break;
                case 2:
                    d2++;
                    break;
                case 3:
                    d3++;
                    break;
                case 4:
                    d4++;
                    break;
                case 5:
                    d5++;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println(vector[i]);
        }
        System.out.println("Se hallaron:\n"
                + d1 + " número(s) de 1 dígito\n"
                + d2 + " número(s) de 2 dígitos\n"
                + d3 + " número(s) de 3 dígitos\n"
                + d4 + " número(s) de 4 dígitos\n"
                + d5 + " número(s) de 5 dígitos\n");
    }

    private static void matrizTraspuesta() {
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                traspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz original:");
        for (int[] n : matriz) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("Matriz traspuesta:");
        for (int[] n : traspuesta) {
            System.out.println(Arrays.toString(n));
        }

    }

    private static void matrizAntisimetrica() {
        int[][] matriz = new int[3][3];
        int[][] traspuesta = new int[3][3];
        int[][] matrizInversa = new int[3][3];
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un número entero");
                matriz[i][j] = scann.nextInt();
                traspuesta[j][i] = matriz[i][j];
                matrizInversa[i][j] = matriz[i][j] * -1;
            }
        }

        System.out.println("Matriz original:");
        for (int[] n : matriz) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("Matriz traspuesta:");
        for (int[] n : traspuesta) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("Matriz invertida:");
        for (int[] n : matrizInversa) {
            System.out.println(Arrays.toString(n));
        }

        System.out.println("Matriz llenada con éxito");

        if (Arrays.deepEquals(matrizInversa, traspuesta)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
        }

    }

    private static void cuadradoMagico() {
        int[][] matriz = new int[3][3];
        int sumaEsperada, sumaTemp, diagonalP = 0, diagonalS = 0;
        boolean magic = true;
        Scanner scann = new Scanner(System.in);

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                do {
                    System.out.println("Ingrese un número entero");
                    matriz1[j] = scann.nextInt();
                } while (matriz1[j] < 0 || matriz1[j] > 9);
            }
        }
        sumaEsperada = Arrays.stream(matriz[0]).sum();

        for (int[] is : matriz) {
            sumaTemp = 0;
            sumaTemp = Arrays.stream(is).sum();
            if (sumaTemp != sumaEsperada) {
                magic = false;
                break;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            sumaTemp = 0;
            for (int[] matriz1 : matriz) {
                sumaTemp += matriz1[i];

            }
            if (sumaTemp != sumaEsperada) {
                magic = false;
                break;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonalP += matriz[i][j];
                    diagonalS += matriz[i][j];
                }
            }
        }

        if (diagonalP != sumaEsperada || diagonalS != sumaEsperada) {
            magic = false;
        }

        if (magic) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado NO es mágico");
        }
    }

    private static void matrizEnMatriz() {
        int[][] matrizTemp;

        int[][] matriz10x10 = 
        {{1, 26, 36, 47, 5, 6, 72, 81, 95, 36},
        {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
        {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
        {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
        {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
        {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
        {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
        {98, 45, 34, 23, 32, 56, 74, 36, 5, 67},
        {24, 67, 97, 46, 87, 13, 67, 89, 90, 75},
        {21, 68, 78, 98, 90, 67, 12, 14, 22, 26}};

        int[][] matriz3x3 = 
        {{36, 5, 67},
        {89, 90, 75},
        {14, 22, 26}};

       
        System.out.println("Matriz base:");
        for (int[] n : matriz10x10) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Matriz buscada:");
        for (int[] n : matriz3x3) {
            System.out.println(Arrays.toString(n));
        }
        System.out.println("------------------------------------------------------------------------");
    
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                matrizTemp = extraerSubmatriz(matriz10x10, i, i + 3, j, j + 3);             
                    if (Arrays.deepEquals(matriz3x3, matrizTemp)){
                        System.out.println("Matriz encontrada entre la posición [" + i + "]["+j+"] y [" + (i+3) + "]["+ (j+3) + "]");
                    }              
            }
        }
      
    }

    public static int[][] extraerSubmatriz(int[][] matriz, int filaIni, int filaFin, int colIni, int colFin) {
        int filas = filaFin - filaIni;
        int columnas = colFin - colIni;

        int[][] submatriz = new int[filas][columnas];

        for (int i = filaIni; i < filaFin; i++) {
            for (int j = colIni; j < colFin; j++) {
                int x = i - filaIni;
                int y = j - colIni;

                submatriz[x][y] = matriz[i][j];
            }
        }
        return submatriz;
    }
}
