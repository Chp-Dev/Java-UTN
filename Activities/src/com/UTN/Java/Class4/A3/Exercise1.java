package com.UTN.Java.Class4.A3;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {

    public static void main(String[] args) {
        String lista = "Argentina, Brasil, Canadá, Chile, Colombia, Costa Rica, Cuba, Estados Unidos, México, Perú";
        String[] paises = lista.split(",");

        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i]);
        }

        try {
            FileWriter writer = new FileWriter("lista_paises.txt");
            for (String pais : paises) {
                writer.write(pais.trim() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
            e.printStackTrace();
        }
    }

    //TODO: El Archivo se guarda en la carpeta out
}