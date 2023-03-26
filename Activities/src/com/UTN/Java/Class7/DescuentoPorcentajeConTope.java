package com.UTN.Java.Class7;

import com.UTN.Java.Class5.A1.DescuentoPorcentaje;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    private double tope;

    public DescuentoPorcentajeConTope(double porcentaje, double tope) {
        super(porcentaje);
        this.tope = tope;
    }

    @Override
    public double calcularDescuento(double monto) {
        double descuento = super.calcularDescuento(monto);
        return descuento > tope ? tope : descuento;
    }
}
