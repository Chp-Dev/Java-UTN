package com.UTN.Java.Class4.A1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Ingrese 'asc' para ordenar ascendente o 'desc' para ordenar descendente: ");
        String order = sc.next();

        if (order.equals("asc")) {
            Arrays.sort(nums);
        } else if (order.equals("desc")) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
