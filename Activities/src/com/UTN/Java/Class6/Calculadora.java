package com.UTN.Java.Class6;

public class Calculadora {

    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }

    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }

    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }

    public double dividir(double unNumero, double otroNumero) throws ArithmeticException {
        if (otroNumero == 0) {
            throw new ArithmeticException("No es posible dividir entre cero.");
        }
        return unNumero / otroNumero;
    }
}

