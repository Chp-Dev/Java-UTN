package com.UTN.Java.Class4.A2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Debe proporcionar la ruta del archivo y la operación (suma o multiplicación).");
            return;
        }

        String archivo = args[0];
        String operacion = args[1];

        if (!operacion.equals("suma") && !operacion.equals("multiplicación")) {
            System.out.println("La operación debe ser 'suma' o 'multiplicación'.");
            return;
        }

        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            int resultado = 0;
            while ((linea = bufferedReader.readLine()) != null) {
                resultado = operacion.equals("suma") ? resultado + Integer.parseInt(linea) : resultado * Integer.parseInt(linea);
            }

            bufferedReader.close();
            System.out.println("El resultado de la " + operacion + " es: " + resultado);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("El archivo debe contener solo números enteros.");
            e.printStackTrace();
        }
    }
}