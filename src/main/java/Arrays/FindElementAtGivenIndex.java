package Arrays;

import java.util.Scanner;

public class FindElementAtGivenIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        findElementAtIndex(key, arr);
        sc.close();
    }

    public static int findElementAtIndex(int key, int[] arr) {
        return arr[key];
    }
}
