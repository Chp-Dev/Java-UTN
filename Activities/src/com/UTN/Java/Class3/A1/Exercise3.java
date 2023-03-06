package com.UTN.Java.Class3.A1;

public class Exercise3 {

    // c. Suma los números mayores a un valor X en un vector
    public static void main(String[] args){
        int[] nums = {1, 7, 8, 10, 15};
        int x = 5;
        int sum = addSeniors(nums, x);
        System.out.println("La suma de los números mayores a " + x + " es: " + sum);
    }
    public static int addSeniors(int[] nums, int x) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
