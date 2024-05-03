package com.kafka.CabBook.controller;

public class FindPairSum {
    public static void findPairsWithSum(int[] nums, int targetSum) {
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == targetSum) {
                    found = true;
                    boolean isMultiple = (nums[i] * nums[j]) % targetSum == 0;
                    System.out.println("(" + nums[i] + "," + nums[j] + "):" + isMultiple);
                }
            }
        }
        if (!found) {
            System.out.println("No results found");
        }
    }
    public static void main(String[] args) {
        int[] x = {-5, 1, -40, 20, 6, 8, 7, -15, 30};
        int[] y =  { -5, 4, -2, 16, 8, 9 };
        int targetSum = 15;
        findPairsWithSum(x, targetSum);
        findPairsWithSum(y, targetSum);
    }
}
