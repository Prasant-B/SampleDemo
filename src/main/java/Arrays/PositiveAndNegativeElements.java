package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PositiveAndNegativeElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr) {
            al.add(i);
        }
        arranged(al);
        sc.close();
    }

    static ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        ArrayList<Integer> al_pos = new ArrayList<>();
        ArrayList<Integer> al_neg = new ArrayList<>();
        ArrayList<Integer> al_res = new ArrayList<>();
        int i = 0;
        while(i<arr.size()) {
            if(arr.get(i)>0) {
                al_pos.add(arr.get(i));
            } else {
                al_neg.add(arr.get(i));
            }
            i++;
        }
        System.out.println(al_pos);
        System.out.println(al_neg);
        int j = 0;
        int k = 0;
        i = 0;
        while(i<arr.size() && (j<al_pos.size() || k<al_neg.size())) {
            if(i%2==0) {
                al_res.add(al_pos.get(j));
                j++;
            } else if(i%2!=0) {
                al_res.add(al_neg.get(k));
                k++;
            }
            i++;
        }
        System.out.println(al_res);
        return al_res;
    }
}
