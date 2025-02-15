package Arrays;

import java.util.Scanner;

public class RotateArrayByNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        leftRotate(arr, d);
        sc.close();
    }

    static void leftRotate(int arr[], int d) {
        int rev_arr[] = new int[arr.length];
        for(int x=1;x<=d;x++) {
            int i = 0;
            if(arr.length==1) {
            } else if(arr.length>1) {
                int temp = arr[0];
                System.out.println("Value is " + temp);
                while(i<arr.length) {
                    if(i<arr.length-1) {
                        System.out.println("Value of i is " + i);
                        rev_arr[i] = arr[i+1];
                    } else if(i==arr.length-1) {
                        System.out.println("Value of i is " + i);
                        rev_arr[arr.length-1] = temp;
                    }
                    i++;
                }
                for(int j=0;j<arr.length;j++) {
                    arr[j] = rev_arr[j];
                }
                for(int k:arr) {
                    System.out.print(k+" ");
                }
            }
        }
    }
}
