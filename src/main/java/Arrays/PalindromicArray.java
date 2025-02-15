package Arrays;

import java.util.Scanner;

public class PalindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        isPalinArray(arr);
        sc.close();
    }

    public static boolean isPalinArray(int[] arr) {
       boolean res = false;
       int i = 0;
       int count = 0;
       while(i<arr.length) {
        String st1 = String.valueOf(arr[i]);
        StringBuilder sbr = new StringBuilder(st1);
        sbr.reverse();
        String revString = new String(sbr);
        if(st1.equals(revString)) {
            count++;
        }
        i++;
       }
       if(count==arr.length) {
        res = true;
       } else {
        res = false;
       }
       return res; 
    }
}
