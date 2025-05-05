package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhyIsMelodySoChocolaty {
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
        maxHappiness(al);
        sc.close();
    }

    public static int maxHappiness(List<Integer> arr) {
        int[] arr1 = new int[arr.size()];
        for(int i = 0; i<arr1.length; i++) {
            arr1[i] = arr.get(i);
        }
        int i = 0;
        int res = 0;
        while(i<arr1.length-1) {
            System.out.println("Value of i is " + i);
            int j = i;
            int sum = 0;
            int k = 0;
            k = j+2;
            while(j<k) {
                System.out.println("Value of j and k are " + j + " " + k);
                sum = sum + arr1[j];
                j++;
            }
            System.out.println("Value of sum and res are " + sum + " " + res);
            if(res<sum) {
                res = sum;
            }
            i++;
        }
        System.out.println("Final res is " + res);
        return res;
    }
}
