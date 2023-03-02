package com.UTN.Java.Class1.A1;

public class Exercise2 {
    public static void main(String[] args) {

        // b. A lo anterior, solo muestre los números pares
        System.out.printf("reply b\n");

        int start = 5;
        int end = 20;

        while(start <= end) {
            if(start % 2 == 0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
