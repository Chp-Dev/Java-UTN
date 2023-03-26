package com.UTN.Java.Class5.A1;

public class Exercise1 {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Producto 1", 10.0, 3);
        Producto producto2 = new Producto("Producto 2", 5.0, 2);
        Producto producto3 = new Producto("Producto 3", 7.5, 1);

        Carrito carrito = new Carrito();
        carrito.addItem(producto1, 2);
        carrito.addItem(producto2, 1);
        carrito.addItem(producto3, 3);


        Descuento descuento = new DescuentoPorcentaje(10.0);
        carrito.aplicarDescuento(descuento);

        System.out.println("Precio total con descuento: $" + carrito.getPrecioTotal());
    }
}
