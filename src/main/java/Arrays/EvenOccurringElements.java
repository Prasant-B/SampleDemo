package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOccurringElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findEvenOccurrences(arr);
        sc.close();
    }

    public static List<Integer> findEvenOccurrences(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        int[] visited = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(visited[i]==1)
                continue;
            int count = 1;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
            if(count%2==0) {
                if(al.contains(-1)) {
                    al.clear();
                }
                al.add(arr[i]);
            }
            System.out.println(al);
        }
        // Arrays.sort(arr);
        // int i = 0;
        // while(i<arr.length) {
        //     int count = 1;
        //     while(i+1<arr.length && arr[i]==arr[i+1]) {
        //         count++;
        //         i++;
        //     }
        //     System.out.println(arr[i] + " occurs " + count + " times");
        //     if(count%2==0) {
        //         if(al.contains(-1)) {
        //             al.clear();
        //         }
        //         al.add(arr[i]);
        //     }
        //     i++;
        // }
        // System.out.println(al);
        return al;
    }
}
