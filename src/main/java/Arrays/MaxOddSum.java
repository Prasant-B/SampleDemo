package Arrays;

import java.util.Scanner;

public class MaxOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findMaxOddSum(arr);
        sc.close();
    }

    public static int findMaxOddSum(int[] arr) {
        int res = 0;
        int sum = 0;
        for(int i: arr) {
            System.out.print(i+ " ");
        }
        int i = 0;
        while(i<arr.length) {
            sum = sum + arr[i];
            System.out.println("Sum is " + sum + " " + arr[i]);
            if(sum%2!=0 && sum>res) {
                res = sum;
            }
           i--; 
        }
        System.out.println(res);
        return res;
    }
}
