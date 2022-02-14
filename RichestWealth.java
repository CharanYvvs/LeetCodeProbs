package com.charan;
import java.util.Scanner;
public class RichestWealth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] accounts = new int[m][n];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = input.nextInt();
            }
        }
        int ans = maximumwealth(accounts);
        System.out.println(ans);
    }

    static int maximumwealth(int[][] accounts) {
        int maximum = -1;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>maximum){
                maximum=sum;
            }
        }
        return maximum;
    }
}
