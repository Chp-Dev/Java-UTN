package com.UTN.Java.Class6;

public class PruebasCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado;


        resultado = calculadora.multiplicar(80, 3);
        System.out.println("Caso de prueba 1: El resultado de multiplicar 80 por 3 da 240");
        System.out.println("El resultado obtenido es: " + resultado);
        System.out.println("El resultado esperado es: " + 240);
        System.out.println("El resultado es " + (resultado == 240 ? "correcto" : "incorrecto"));
        System.out.println();



        resultado = calculadora.dividir(calculadora.sumar(150, 180), 3);
        System.out.println("Caso de prueba 2: El resultado de sumar 150 y 180, dividido por 3, da 110");
        System.out.println("El resultado obtenido es: " + resultado);
        System.out.println("El resultado esperado es: " + 110);
        System.out.println("El resultado es " + (resultado == 110 ? "correcto" : "incorrecto"));
        System.out.println();


        resultado = calculadora.multiplicar(calculadora.restar(90, 50), 15);
        System.out.println("Caso de prueba 3: El resultado de restar 90 y 50, multiplicado por 15, no da 605.");
        System.out.println("El resultado obtenido es: " + resultado);
        System.out.println("El resultado esperado es: " + 605);
        System.out.println("El resultado es " + (resultado == 605 ? "correcto" : "incorrecto"));
        System.out.println();


        resultado = calculadora.multiplicar(calculadora.sumar(70, 40), 25);
        System.out.println("Caso de prueba 4: El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.");
        System.out.println("El resultado obtenido es: " + resultado);
        System.out.println("El resultado esperado es: " + 2700);
        System.out.println("El resultado es " + (resultado == 2700 ? "correcto" : "incorrecto"));
    }
}
