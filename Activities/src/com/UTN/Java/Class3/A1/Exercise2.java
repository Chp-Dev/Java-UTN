package com.UTN.Java.Class3.A1;

import java.util.Arrays;

public class Exercise2 {

    // b. Ordena 3 números y los retorna en un vector de 3
    public static void main(String[] args){
        int num1 = 5;
        int num2 = 10;
        int num3 = 1;
        String order = "ascendente";
        int[] nums = orderNumbers(num1, num2, num3, order);
        System.out.println("Los números ordenados son: " + Arrays.toString(nums));
    }
    public static int[] orderNumbers(int num1, int num2, int num3, String order) {
        int[] nums = { num1, num2, num3 };
        if (order.equals("ascendente")) {
            Arrays.sort(nums);
        } else if (order.equals("decreciente")) {
            Arrays.sort(nums);
            int temp = nums[0];
            nums[0] = nums[2];
            nums[2] = temp;
        }
        return nums;
    }
}
