package Arrays;

import java.util.Scanner;

public class CountPairOfOddXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        countOddXorPairs(arr);
        sc.close();
    }

    public static long countOddXorPairs(int[] arr) {
        long count = 0;
        int i = 0;
        while(i<arr.length) {
            int j = i;
            while(j<arr.length) {
                if((arr[j]^arr[i])%2!=0) {
                    count++;
                }
                j++;
            }
            i++;
        }
        System.out.println(count);
        return count;
    }
}
