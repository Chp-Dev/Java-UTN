package com.UTN.Java.Class7;

import com.UTN.Java.Class5.A1.Producto;

import java.util.ArrayList;
import java.util.List;

public class PorcentajeCarrito {
    public class CarritoCompras {
        private List<Producto> productos;
        private double total;
        private double descuento;

        public CarritoCompras() {
            total = 0.0;
            descuento = 0.0;
            productos = new ArrayList<>();
        }

        public void agregarProducto(Producto producto) {
            productos.add(producto);
            total += producto.getPrecio();
        }

        public void quitarProducto(Producto producto) {
            productos.remove(producto);
            total -= producto.getPrecio();
        }

        public void calcularDescuento(double descuento, boolean esPorcentaje) {
            if (esPorcentaje) {
                this.descuento = total * descuento / 100;
            } else {
                this.descuento = descuento;
            }
        }

        public double getTotal() {
            return total - descuento;
        }

        public double getDescuento() {
            return descuento;
        }
    }

}
