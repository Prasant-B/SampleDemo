package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemOfIdenticalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i: arr1) {
            al1.add(i);
        }
        for(int j: arr2) {
            al2.add(j);
        }
        isIdentical(al1, al2);
        sc.close();
    }

    public static boolean isIdentical(List<Integer> a, List<Integer> b) {
        boolean flag = true;
        Collections.sort(a);
        Collections.sort(b);
        if(a.size()!=b.size()) {
            flag = false;
        } else if(a.size()==b.size()) {
            int i = 0;
            int j = 0;
            while(i<a.size() && j<b.size()) {
                if(!(a.get(i).equals(b.get(j)))) {
                    flag = false;
                    break;
                }
                i++;
                j++;
            }
        }
        return flag;
    }
}
