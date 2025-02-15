package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionallyOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        getOddOccurrence(arr, n);
        sc.close();
    }

    static int getOddOccurrence(int[] arr, int n) {
        Arrays.sort(arr);
        int res = 0;
        int i = 0;
        int j = 1;
        while(j<=arr[arr.length-1]) {
            int num = 0;
            num = j;
            System.out.println("Number is " + num);
            int count = 0;
            while(i<arr.length) {
                if(arr[i]==num) {
                    System.out.println("Numbers are " + arr[i] + " " +num);
                    count++;
                } else {
                    break;
                }
                i++;
            }
            if(count%2!=0) {
                res = num;
                System.out.println("The result is " + res);
                break;
            }
            j++;
        }
        return res; 
    }
}
