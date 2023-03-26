package com.UTN.Java.Class5.A1;

public class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double calcularDescuento(double precioTotal) {
        return precioTotal * porcentaje / 100;
    }
}
