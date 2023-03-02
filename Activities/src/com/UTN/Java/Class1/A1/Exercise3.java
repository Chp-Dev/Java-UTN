package com.UTN.Java.Class1.A1;

public class Exercise3 {
    public static void main(String[] args) {

        //c. A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares
        System.out.println("reply c\n");

        int start = 5;
        int end = 20;

        int value = 0; // 0 par, 1 impares
        int l = start;
        while(l <= end) {
            if(value == 0 && l % 2 == 0) {
                System.out.println(l);
            } else if(value == 1 && l % 2 != 0) {
                System.out.println(l);
            }
            l++;
        }
    }
}
