package Arrays;

import java.util.Scanner;

public class FathestIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        findIndex(arr, x);
        sc.close();
    }

    public static int findIndex(int[] arr, int x) {
        int farthest = -1;
        int i = 0;
        while(i<arr.length) {
            if(arr[i]==x) {
                farthest = i;
            }
            i++;
        }
        if(farthest!=-1) {
            farthest = farthest + 1;
        }
        return farthest;
    }
}
