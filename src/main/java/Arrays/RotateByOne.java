package Arrays;

import java.util.Scanner;

public class RotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr);
        sc.close();
    }

    public static void rotate(int[] arr) {
        int rev_arr[] = new int[arr.length];
        int i = 1;
        if(arr.length==1) {
        } else if(arr.length>1) {
            while(i<arr.length) {
                rev_arr[i] = arr[i-1];
                if(i==arr.length-1) {
                 rev_arr[0] = arr[arr.length-1];
                }
                i++;
            }
            for(int j=0;j<arr.length;j++) {
                arr[j] = rev_arr[j];
            }
            for(int k:arr) {
                System.out.print(k+" ");
            }
        } 
    }
}
