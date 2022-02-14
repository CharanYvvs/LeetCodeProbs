package com.charan;
import java.util.Scanner;
import java.util.Arrays;
public class RunningSumOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = input.nextInt();
        }
        int[] ans = RunningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] RunningSum(int[] nums){
        int[] ans = new int [nums.length];
        ans[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i] = ans[i-1] + nums[i];
        }
        return ans;
    }
}
