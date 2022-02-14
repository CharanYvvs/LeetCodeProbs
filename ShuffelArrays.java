package com.charan;
import java.util.Scanner;
import java.util.Arrays;
public class ShuffelArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] nums = new int[2*n];
        for(int i=0;i<nums.length;i++){
            nums[i] = input.nextInt();
        }
        //ShuffleArray(nums,3);
        int[] ans = ShuffleArray(nums,3);
        int[] answer = ShuffleArrays(nums,3);
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(ans));

    }
    static int[] ShuffleArray(int[] nums, int n){ // BruteForce Approach
        int[] result = new int[2*n]; // creating an extra array
        int j=0;
        for(int i=0;i<2*n;i=i+2){
            result[i] = nums[j];
            result[i+1] = nums[j+n];
            j++;
        }
        return result;
    }
    static int[] ShuffleArrays(int[] nums, int n){ // Optimized Approach by without using extra array
        for(int i=0;i<n;i++){
            nums[i+n] += nums[i]*1000;
        }
        for(int i=0;i<n;i++){
            nums[2*i] = nums[i+n]/1000;
            nums[2*i+1] = nums[i+n]%1000;
        }
        return nums;
    }
}
