package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RepeatedIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        uniqueId(arr);
        sc.close();
    }

    public static ArrayList<Integer> uniqueId(int[] arr) {
       LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
       for(int i: arr) {
        lhs.add(i);
       }
       ArrayList<Integer> al = new ArrayList<>(lhs);
       return al;
    }
}
