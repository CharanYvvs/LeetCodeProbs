package com.charan;
import java.util.Arrays;
import java.util.Scanner;
public class BuildArrayPermutation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = input.nextInt();
        }
        int[] ans = BuildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] BuildArray(int[] nums){
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
