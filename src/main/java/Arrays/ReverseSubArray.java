package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSubArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: arr1) {
            arr.add(i);
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        reverseSubArray(arr, l, r);
        sc.close();
    }

    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l, int r) {
        ArrayList<Integer> rev_al = new ArrayList<>();
        r = r-1;
        l = l-1;
        System.out.println(l + " " + r);
        while(r>=l) {
            rev_al.add(arr.get(r));
            arr.remove(r);
            r--;
        }
        System.out.println(rev_al);
        arr.addAll(l, rev_al);
        System.out.println(arr);
        return arr;
    }
}
