package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortFirstHalfAscendingSecondHalfDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        customSort(arr);
        sc.close();
    }

    public static ArrayList<Integer> customSort(int[] arr) {
        ArrayList<Integer> al_res = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:arr) {
            al.add(i);
        }
        ArrayList<Integer> al_asc = new ArrayList<>();
        ArrayList<Integer> al_desc = new ArrayList<>();
        int len = (arr.length/2) - 1;
        int i = 0;
        while(i<arr.length) {
            if(i<=len) {
                al_asc.add(al.get(i));
            } else {
                al_desc.add(al.get(i));
            }
            i++;
        }
        System.out.println(al_asc);
        System.out.println(al_desc);
        Collections.sort(al_asc);
        Collections.sort(al_desc);
        Collections.reverse(al_desc);
        al_res.addAll(al_asc);
        al_res.addAll(al_desc);
        System.out.println(al_asc);
        System.out.println(al_desc);
        System.out.println(al_res);
        return al_res;
    }
}
