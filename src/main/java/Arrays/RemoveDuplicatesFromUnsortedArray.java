package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        removeDuplicate(arr);
        sc.close();
    }

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int i: arr) {
            lhs.add(i);
        }
        return new ArrayList<>(lhs);
        // int i = 0;
        // while(i<al.size()) {
        //     int j = 0;
        //     while(j<al.size()) {
        //         //System.out.println(al.get(i) + " " + al.get(j));
        //         if(i!=j) {
        //             if(al.get(i).equals(al.get(j))) {
        //                 System.out.println(i + " " + j + " " + al.get(i) + " " + al.get(j));
        //                 al.remove(j);
        //             } 
        //         }
        //         // if(al.get(i).equals(al.get(j))) {
        //         //     if(i!=j) {
        //         //         System.out.println(i + " " + j + " " + al.get(i) + " " + al.get(j));
        //         //         al.remove(j);
        //         //     }
        //         // }
        //         j++;
        //         System.out.println(al);
        //     }
        //     i++;
        // }
        // System.out.println(al);
        // return al;
    }
}
