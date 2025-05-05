package Arrays;

import java.util.Scanner;

public class AGuyWithMentalProblem {
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
        minTime(arr1, arr2);
        sc.close();
    }

    public static int minTime(int[] arr1, int[] arr2) {
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;
        while(i<arr1.length || i<arr2.length) {
            if(i%2!=0) {
                sum1 = sum1 + arr1[i];
            } else {
               sum1 = sum1 + arr2[i]; 
            }
            i++;
        }

        i = 0;
        while(i<arr1.length || i<arr2.length) {
            if(i%2==0) {
                sum2 = sum2 + arr1[i];
            } else {
               sum2 = sum2 + arr2[i]; 
            }
            i++;
        }
        int min = 0;
        if(sum1>sum2) {
            min = sum2;
        } else if(sum1<sum2) {
            min = sum1;
        }
        return min;
    }
}
