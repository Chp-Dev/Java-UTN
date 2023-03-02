package com.UTN.Java.Class1.A1;

public class Exercise4 {
    public static void main(String[] args) {

        //d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden

        System.out.println("reply d\n");

        int[] num = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < num.length/2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length-1-i] = temp;
        }
        showNum(num);
    }
    public static void showNum(int[] num) {
        for (int j = 0; j < num.length; j++){
            System.out.println(num[j]);
        }
    }
}
