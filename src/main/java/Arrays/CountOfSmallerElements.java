package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>(n);
        for(int i: al) {
            al.get(i);
        }
        countOfElements(x, al);
        sc.close();
    }

    public static int countOfElements(int x, List<Integer> arr) {
        int res = 0;
        int i = 0;
        Collections.sort(arr);
        while(i<arr.size()) {
            if(arr.get(i)<=x) {
                res++;
            } else {
                break;
            }
            i++;
        }
        System.out.println(res);
        return res;
    }
}
