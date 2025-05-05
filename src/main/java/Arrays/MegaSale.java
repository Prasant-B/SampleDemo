package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MegaSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        maxProfit(m, arr);
        sc.close();
    }

    public static int maxProfit(int m, int[] arr) {
        int sale = 0;
        Arrays.sort(arr);
        int i = 0;
        if(m>arr.length) {
            while(i<arr.length) {
                if(arr[i]<0) {
                    sale = sale + arr[i];
                }
                i++;
            }        
        } else if(m<=arr.length) {
            while(i<m) {
                if(arr[i]<0) {
                    sale = sale + arr[i];
                }
                i++;
            }   
        }
        return Math.abs(sale);
    }
}
