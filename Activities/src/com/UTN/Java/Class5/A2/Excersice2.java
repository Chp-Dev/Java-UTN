package com.UTN.Java.Class5.A2;

import com.UTN.Java.Class5.A1.Carrito;
import com.UTN.Java.Class5.A1.Producto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Excersice2 {
    public static void main(String[] args) {
        String fileName = "items.txt"; // Nombre del archivo con los items
        Carrito carrito = new Carrito(); // Creamos un nuevo carrito

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t"); // Dividimos la línea por tabuladores

                // Obtenemos los datos de la línea
                int cantidad = parseInt(parts[0]);
                double precioUnitario = Double.parseDouble(parts[1]);
                String producto = parts[2];

                // Creamos un nuevo producto y lo agregamos al carrito
                Producto p = new Producto(producto, precioUnitario, 1);
                carrito.addItem(p, cantidad);
            }

            reader.close();

            // Imprimimos el precio total del carrito
            System.out.println("Precio total: $" + carrito.getPrecioTotal());

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
