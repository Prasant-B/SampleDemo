package Arrays;

import java.util.Scanner;

public class CountPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        countPairs(arr1, arr2, x);
        sc.close();
    }

    static int countPairs(int arr1[], int arr2[], int x) {
        int count = 0;
        int i = 0;
        while(i<arr1.length) {
            int j = 0;
            while(j<arr2.length) {
                if(arr1[i]+arr2[j]==x) {
                    count++;
                    break;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}
