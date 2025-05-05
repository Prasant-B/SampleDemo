package Arrays;

import java.util.Scanner;

public class LargestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findMaxProduct(arr, k);
        sc.close();
    }

    public static int findMaxProduct(int[] arr, int k) {
        int max = 1;
        int i = 0;
        int tot = arr.length - k;
        while(i<=tot) {
            int product = 1;
            System.out.println("Value of i " + i);
            int j = i;
            System.out.println("Value of j and k are " + j + " " + k);
            while(j<k) {
                product = product*arr[j];
                j++;
            }
            System.out.println("Product is " + product + " and max is " + max);
            if(product>max) {
               max = product; 
            }
            i++;
            k++;
            System.out.println("Value of k " + k);
        }
        System.out.println("Max is " + max);
        return max;
    }
}
