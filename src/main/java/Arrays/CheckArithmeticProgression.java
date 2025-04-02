package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        checkIsAP(arr);
        sc.close();
    }

    public static boolean checkIsAP(int[] arr) {
        boolean res = false;
        Arrays.sort(arr);
        int i = 0;
        while(i<arr.length-1) {
            int d = 0;
            d = arr[i+1] - arr[i];
            int l = arr[0] + (arr.length-1)*d;
            if(l==arr[arr.length-1]) {
                res = true;
            } else {
                res = false;
                break;
            }
            i++;
        }
        return res;
    }
}
