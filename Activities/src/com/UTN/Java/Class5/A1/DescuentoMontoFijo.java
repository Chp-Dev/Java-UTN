package com.UTN.Java.Class5.A1;

public class DescuentoMontoFijo extends Descuento {
    private double montoFijo;

    public DescuentoMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public double calcularDescuento(double precioTotal) {
        return montoFijo;
    }
}
