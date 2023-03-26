package com.UTN.Java.Class6;

import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        double unNumero, otroNumero, resultado;
        String opcion;

        do {
            System.out.println("\n---- MENÚ CALCULADORA ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Limpiar");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese el primer número: ");
                    unNumero = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    otroNumero = scanner.nextDouble();
                    resultado = calculadora.sumar(unNumero, otroNumero);
                    System.out.println("El resultado de la suma es: " + resultado);
                    scanner.nextLine();
                    break;
                case "2":
                    System.out.print("Ingrese el primer número: ");
                    unNumero = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    otroNumero = scanner.nextDouble();
                    resultado = calculadora.restar(unNumero, otroNumero);
                    System.out.println("El resultado de la resta es: " + resultado);
                    scanner.nextLine();
                    break;
                case "3":
                    System.out.print("Ingrese el primer número: ");
                    unNumero = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    otroNumero = scanner.nextDouble();
                    resultado = calculadora.multiplicar(unNumero, otroNumero);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    scanner.nextLine();
                    break;
                case "4":
                    System.out.print("Ingrese el primer número: ");
                    unNumero = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    otroNumero = scanner.nextDouble();
                    try {
                        resultado = calculadora.dividir(unNumero, otroNumero);
                        System.out.println("El resultado de la división es: " + resultado);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    scanner.nextLine();
                    break;
                case "5":
                    System.out.print("\033[H\033[2J"); // Limpia la consola en Linux y Mac
                    System.out.flush();
                    break;
                case "6":
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (!opcion.equals("6"));
        scanner.close();
    }
}
