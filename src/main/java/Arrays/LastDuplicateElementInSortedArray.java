package Arrays;

import java.util.Scanner;

public class LastDuplicateElementInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        dupLastIndex(arr);
        sc.close();
    }

    public static int[] dupLastIndex(int[] arr) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int i = arr.length - 1;
        while(0 < i) {
            if(arr[i]==arr[i-1]) {
                res[0] = i;
                res[1] = arr[i];
                break;
            }
            i--;
        }
        System.out.println(res[0] + " " + res[1]);
        return res;
    }
}
