package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PlayWithAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        formatArray(arr);
        sc.close();
    }

    static String formatArray(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 1;
        int cur = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (cur == arr[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    count = 1;
                    cur = arr[i];
                }
            }
        }
        if (count <= 1) {
            return "true";
        } else {
            return "false";
        }
    }
}
