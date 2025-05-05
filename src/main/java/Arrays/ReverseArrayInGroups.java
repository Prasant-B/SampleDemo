package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextLong();
        }
        ArrayList<Long> al = new ArrayList<>();
        for(long i: arr) {
            al.add(i);
        }
        int k = sc.nextInt();
        reverseInGroups(al, k);
        sc.close();
    }

    static void reverseInGroups(ArrayList<Long> arr, int k) {
        long[] arr1 = new long[arr.size()];
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        if(k>=arr.size()) {
            Collections.reverse(arr);
        } else {
            ArrayList<Long> al = new ArrayList<>();
            int i = 0;
            int j = 0;
            while(i<arr1.length) {
                System.out.println("Inside else while");
                System.out.println("Difference is " + (arr1.length - al.size()));
                if((arr1.length - al.size())<=k) {
                    System.out.println("Value of i is " + i);
                    System.out.println("Inside if");
                    int m = arr1.length-1;
                    System.out.println("Value of m is " + m);
                    while(m>=i) {
                        al.add(arr1[m]);
                        m--;
                    }
                } else if((arr1.length - al.size())>k) {
                    j = (i+k)-1;
                    System.out.println("Value of i is " + i);
                    while(j>=i) {
                        al.add(arr1[j]);
                        j--;
                    }
                }
                i=i+k;
                System.out.println(al);
            }
            System.out.println(al);
            arr.clear();
            arr.addAll(al);
        }
    }
}

