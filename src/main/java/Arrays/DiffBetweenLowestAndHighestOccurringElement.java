package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DiffBetweenLowestAndHighestOccurringElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        findDiff(arr);
        sc.close();
    }

    public static int findDiff(int[] arr) {
        Arrays.sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
        ArrayList<Integer> al = new ArrayList<>();
        int j = arr[0];
        int k = arr[arr.length-1];
        while(j<=k) {
            int i = 0;
            int count = 0;
            while(i<arr.length) {
                if(arr[i]==j) {
                    count++;
                }
                i++;
            }
            if(count > 0) 
                al.add(count);
            j++;
        }
        System.out.println(al);
        Collections.sort(al);
        return Math.abs(al.get(0) - al.get(al.size()-1));
    }
}
