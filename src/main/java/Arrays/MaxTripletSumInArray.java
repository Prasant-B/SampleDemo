package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxTripletSumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr) {
            al.add(i);
        }
        maxTripletSum(al);
        sc.close();
    }

    public static int maxTripletSum(List<Integer> arr) {
        int res = 0;
        Collections.sort(arr);
        int i = arr.size();
        res = arr.get(i-1) + arr.get(i-2) + arr.get(i-3);
        return res;
    }
}
