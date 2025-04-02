package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AverageCountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        countArray(arr, x);
        sc.close();
    }

    public static ArrayList<Integer> countArray(int[] arr, int x) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] arr_sort = new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            arr_sort[i] = arr[i];
        }
        Arrays.sort(arr_sort);
        int i = 0;
        while(i<arr.length) {
            double avg = 0;
            avg = (int)Math.floor((arr[i]+x)/2);
            System.out.println("Average is " + avg);
            int j = 0;
            int count = 0;
            while(j<arr_sort.length-1) {
                if(arr_sort[j]==avg) {
                    count++;
                }
                j++;
            }
            al.add(count);
            i++;
        }
        // for(int i: arr) {
        //     al.add(i);
        // }
        // ArrayList<Integer> al_sort = new ArrayList<>(al);
        // Collections.sort(al_sort);
        // System.out.println(al_sort);
        // ArrayList<Integer> res_al = new ArrayList<>();
        // int i = 0;
        // while(i<al.size()) {
        //     double avg = 0;
        //     avg = (int)Math.floor(((al.get(i) + x)/2));
        //     System.out.println("Average is " + avg);
        //     int j = 0;
        //     int count = 0;
        //     System.out.println(al_sort.lastIndexOf(al.get(i)));
        //     while(j<=al_sort.lastIndexOf(al.get(i))) {
        //         if(al_sort.get(j)==avg) {
        //             count++;
        //         }
        //         j++;
        //     }
        //     System.out.println("Count is " + count);
        //     res_al.add(count);
        //     i++;
        // }
        System.out.println(al);
        return al;
    }
}
