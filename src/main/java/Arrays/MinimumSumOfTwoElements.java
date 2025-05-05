package Arrays;

import java.util.Scanner;

public class MinimumSumOfTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        minSum(arr1, arr2);
        sc.close();
    }

    public static int minSum(int[] arr1, int[] arr2) {
        int min = 0;
        int i = 0;
        while (i<arr1.length) {
            int j = 0;
            while(j<arr2.length) {
                int sum = 0;
                if(i!=j&&(i==0&&j==1)) {
                    System.out.println("In first block");
                    sum = arr1[i] + arr2[j];
                    System.out.println("Value of i and j are " + i + " " + j);
                    System.out.println("Sum of elements from i and j is " + sum);
                    min = sum;
                    System.out.println("Min from 1st block " + min);
                } else if(i!=j) {
                    System.out.println("In second block");
                    sum = arr1[i] + arr2[j];
                    System.out.println("Value of i and j are " + i + " " + j);
                    System.out.println("Sum of elements from i and j is " + sum);
                    System.out.println("Min from 2nd block " + min);
                    if(sum<min) {
                        min = sum;
                        System.out.println("Min is " + min);
                    }
                }
                j++;
            }
            i++;
        }
        System.out.println(min);
        return min;
    }
}
