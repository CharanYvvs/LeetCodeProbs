package com.charan;
import java.util.Scanner;
import java.util.Arrays;
public class ConcatenationOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = input.nextInt();
        }
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));

    }
    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
