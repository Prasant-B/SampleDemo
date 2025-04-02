package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlternativeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        alternateSort(arr);
        sc.close();
    }

    public static ArrayList<Integer> alternateSort(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr1 = new int[arr.length];
        Arrays.sort(arr);
        if(arr.length%2==0 || arr.length%2!=0) {
            int j = 0;
            int k = arr.length-1;
            int i = 0;
            while (j<=k && i<arr1.length) {
                if(i%2==0) {
                    arr1[i] = arr[k];
                    k--;
                } else if(i%2!=0) {
                    arr1[i] = arr[j];
                    j++;
                }
                i++;
            }
        }
        for(int i: arr1) {
            al.add(i);
        }
        System.out.println(al);
        return al;
    }
}
