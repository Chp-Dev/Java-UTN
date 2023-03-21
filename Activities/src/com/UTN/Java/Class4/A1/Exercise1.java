package com.UTN.Java.Class4.A1;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        String order = args[3];

        int[] nums = { num1, num2, num3 };

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
