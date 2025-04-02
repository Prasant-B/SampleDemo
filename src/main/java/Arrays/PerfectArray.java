package Arrays;

import java.util.Scanner;

public class PerfectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        isPerfect(arr);
        sc.close();
    }

    public static boolean isPerfect(int[] arr) {
        boolean res = false;
        int i = 1;
        while(i<arr.length && arr[i] > arr[i-1]) {
            ++i;
            System.out.println("1 executed");
        }

        while(i<arr.length && arr[i] == arr[i-1]) {
            ++i;
            System.out.println("2 executed");
        }

        while(i<arr.length && arr[i] < arr[i-1]) {
            ++i;
            System.out.println("3 executed");
        }

        System.out.println(i);
        if(i==arr.length) {
            res = true;
        }

        return res;
    }
}
