package com.UTN.Java.Class4.A1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        if (args.length == 4) { // Si se proporcionan los parámetros en la línea de comandos
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            String orden = args[3];

            ordenarNumeros(num1, num2, num3, orden);

        } else { // Si no se proporcionan los parámetros en la línea de comandos
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el primer número: ");
            int num1 = sc.nextInt();

            System.out.println("Ingrese el segundo número: ");
            int num2 = sc.nextInt();

            System.out.println("Ingrese el tercer número: ");
            int num3 = sc.nextInt();

            System.out.println("Ingrese 'A' si desea ordenar de forma ascendente o 'D' si desea ordenar de forma descendente: ");
            String orden = sc.next().toUpperCase();

            ordenarNumeros(num1, num2, num3, orden);
        }
    }

    public static void ordenarNumeros(int num1, int num2, int num3, String orden) {
        int[] numeros = {num1, num2, num3};

        if (orden.equals("A")) {
            Arrays.sort(numeros);
        } else if (orden.equals("D")) {
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length / 2; i++) {
                int temp = numeros[i];
                numeros[i] = numeros[numeros.length - 1 - i];
                numeros[numeros.length - 1 - i] = temp;
            }
        } else {
            System.out.println("La opción ingresada no es válida. Por favor, ingrese 'A' o 'D'");
            return;
        }

        System.out.println("Los números ordenados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

