package com.UTN.Java.Class3.A2;

public class Exercise1 {

        public static void main(String[] args) {
            String lista = "Argentina, Brasil, Canadá, Chile, Colombia, Costa Rica, Cuba, Estados Unidos, México, Perú";
            String[] paises = lista.split(",");
            for (int i = 0; i < paises.length; i++) {
                System.out.println(paises[i]);
            }
        }
    }
