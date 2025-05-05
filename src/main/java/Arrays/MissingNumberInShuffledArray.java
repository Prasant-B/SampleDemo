package Arrays;

import java.util.Scanner;

public class MissingNumberInShuffledArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++) {
            arr2[i] = sc.nextInt();
        }
        findMissing(arr1, arr2);
        sc.close();
    }

    public static int findMissing(int[] arr1, int[] arr2) {
        int missing = 0;
        int i = 0;
        while(i<arr1.length) {
            int j = 0;
            int count = 0;
            while(j<arr2.length) {
              if(arr1[i] == arr2[j]) {
                count++;
                break;
              }
              j++;
            }
            if(count==0) {
                missing = arr1[i];
                break;
            }
            i++;
        }
        return missing;
    }
}
