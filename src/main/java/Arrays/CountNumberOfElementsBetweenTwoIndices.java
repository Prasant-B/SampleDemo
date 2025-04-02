package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CountNumberOfElementsBetweenTwoIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: arr1) {
            arr.add(i);
        }
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        getCount(arr, num1, num2);
        sc.close();
    }

    public static int getCount(ArrayList<Integer> arr, int num1, int num2) {
        int count = 0;
        int[] arr1 = new int[arr.size()];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        int l_index = 0;
        int r_index = 0;
        int j = 0;
        while(j<arr1.length) {
            if(arr1[j]==num1) {
                l_index = j;
                break;
            }
            j++;
        }
        j = arr1.length-1;
        while(j>=0) {
            if(arr1[j]==num2) {
                r_index = j;
                break;
            }
            j--;
        }
        System.out.println(l_index + " " + r_index);
        if(l_index>r_index) {
            count = 0;
        } else {
            count = Math.abs((r_index - l_index) + 1);
        }
        return count;
    }
}
