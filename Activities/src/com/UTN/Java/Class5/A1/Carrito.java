package com.UTN.Java.Class5.A1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ItemCarrito> items;
    private Descuento descuento;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void addItem(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        items.add(item);
    }

    public void removeItem(ItemCarrito item) {
        items.remove(item);
    }

    public double getPrecioTotal() {
        double precioTotal = 0;
        for (ItemCarrito item : items) {
            precioTotal += item.getPrecioTotal();
        }
        if (descuento != null) {
            precioTotal -= descuento.calcularDescuento(precioTotal);
        }
        return precioTotal;
    }

    public void aplicarDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public String getPrecio() {
        return null;
    }

}
