package Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class MergeAndSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++) {
            brr[i] = sc.nextInt();
        }
        mergeNsort(arr, brr);
        sc.close();
    }

    public static int[] mergeNsort(int[] arr, int[] brr) {
        TreeSet<Integer> lhs1 = new TreeSet<>();
        for(int i: arr) {
            lhs1.add(i);
        }
        System.out.println(lhs1);
        for(int i: brr) {
            lhs1.add(i);
        }
        System.out.println(lhs1);
        int[] res = lhs1.stream().mapToInt(Number::intValue).toArray();
        return res;
    }
}
