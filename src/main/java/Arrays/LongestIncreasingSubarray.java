package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubarray {
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
        lenOfLongIncSubArr(al);
        sc.close();
    }

    public static int lenOfLongIncSubArr(List<Integer> arr) {
        int[] arr1 = new int[arr.size()];
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        int max = 0;
        int i = 0;
        int count = 1;
        while(i<arr1.length-1) {
            System.out.println("Value of i and i+1 are " + i + " " + (i+1));
            System.out.println("Value of elements are " + arr1[i] + " " + arr1[i+1]);
            if(arr1[i]<arr1[i+1]) {
                System.out.println("Into if block");
                count++;
            } else {
                System.out.println("Into else block");
                if(max<count) {
                    max = count;
                }
                count = 1;
            }
            if(max<count) {
                max = count;
            }
            System.out.println("Max and count are " + max + " " + count);
            i++;
        }
        return max;
    }
}
