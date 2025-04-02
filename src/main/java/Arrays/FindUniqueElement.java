package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findUnique(k, arr);
        sc.close();
    }

    public static int findUnique(int k, int[] arr) {
        Arrays.sort(arr);
        int i = 1;
        int res = 0;
        while(i<=arr[arr.length-1]) {
            int j = 0;
            int count = 0;
            while(j<arr.length) {
                if(i==arr[j]) {
                    count++;
                }
                j++;
            }
            if(count%k != 0) {
                res = i;
                break;
            }
            i++;
        }
        return res;
    }
}