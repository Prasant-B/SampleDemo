package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SegregateEvenOdd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        segregateEvenOdd(arr);
        sc.close();
    }

    static void segregateEvenOdd(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer i:arr) {
            al.add(i);
        }
        System.out.println(al);
        ArrayList<Integer> al_even = new ArrayList<>();
        ArrayList<Integer> al_odd = new ArrayList<>();
        int i = 0;
        int even = 0;
        int odd = 0;
        while(i<al.size()) {
            if(al.get(i)%2==0) {
                al_even.add(al.get(i));
                even++;
            } else if(al.get(i)%2!=0) {
                al_odd.add(al.get(i));
                odd++;
            }
            i++;
        }
        System.out.println(al_even);
        System.out.println(al_odd);
        if(even!=0 && odd!=0) {
            Collections.sort(al_even);
            Collections.sort(al_odd);
            al_even.addAll(al_odd);
            for(int j=0;j<al_even.size();j++) {
                arr[j] = al_even.get(j);
            }
        } else if(even==0) {
            for(int j=0;j<al_odd.size();j++) {
                arr[j] = al_odd.get(j);
            }
        } else if(odd==0) {
            for(int j=0;j<al_even.size();j++) {
                arr[j] = al_even.get(j);
            }
        }
        System.out.println(al_even);
        System.out.println(al_odd);
        for(int k:arr)
        System.out.print(k + " ");
    }
}
