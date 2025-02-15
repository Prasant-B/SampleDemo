package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMoveToFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>(n);
        for(Integer i:arr) {
            al.add(i);
        }
        minMoves(al);
        sc.close();
    }
    public static int minMoves(ArrayList<Integer> arr) {
        Integer[] arr1 = new Integer[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            arr1[i] = arr.get(i);
        }
        int counter = 0;
        int i = 0;
        while(i<arr1.length) {
            if(arr1[i]==(i+1)) {
                continue;
            } else {
                counter++;
            }
            i++;
        }
        System.out.println(counter);
        return counter;
    }
}
