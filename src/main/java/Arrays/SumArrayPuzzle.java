package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumArrayPuzzle {
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
        sumArray(al);
        sc.close();
    }

    public static void sumArray(List<Integer> arr) {
        int[] sum = new int[arr.size()];
        for(int i = 0; i < sum.length; i++) {
            sum[i] = arr.get(i);
        }
        arr.clear();
        int i = 0;
        while(i<sum.length) {
            int j = 0;
            int count = 0;
            while (j<sum.length) {
                if(i!=j) {
                    count = count + sum[j];
                }
                j++;
            }
            arr.add(count);
            i++;
        }
    }
}
