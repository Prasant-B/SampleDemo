package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RearrangingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        Rearrange(arr);
        sc.close();
    }

    public static ArrayList<Integer> Rearrange(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        int k = 0;
        k = (arr.length/2);
        if(arr.length%2!=0) {
            if(arr.length==1) {
                al.add(arr[0]);
            }
            int i = 0, j = arr.length-1;
            while(i<k && j>k) {
                al.add(arr[i]);
                al.add(arr[j]);
                i++;
                j--;
                if(i==k && j==k) {
                    al.add(arr[i]);
                }
            }
        } else if(arr.length%2==0) {
            int i = 0, j = arr.length-1;
            while(i<=k && j>=k) {
                al.add(arr[i]);
                al.add(arr[j]);
                i++;
                j--;
            }
        }
        System.out.println(al);
        return al;
    }
}
