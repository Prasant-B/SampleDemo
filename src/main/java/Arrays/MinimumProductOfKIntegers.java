package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumProductOfKIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        minProduct(arr, k);
        sc.close();
    }

    static int minProduct(int arr[], int k) {
        Arrays.sort(arr);
        for(int i:arr) {
            System.out.print(i + " ");
        }
        int i = 0;
        int res = 1;
        while(i<k) {
            if(i<0) {
                if(arr[i]!=arr[i+1]) {
                    res = res * arr[i];
                } 
            }
            i++;
        }
        System.out.println(res);
        return res;
    }
}
