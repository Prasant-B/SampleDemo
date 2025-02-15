package Arrays;

import java.util.Scanner;

public class ImmediateSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        immediateSmallerFunc(arr);
        sc.close();
    }
        
    public static void immediateSmallerFunc(int arr[]) {
       //int[] res_arr = new int[arr.length];
       int i = 0;
       while(i<=arr.length-1) {
        System.out.println("For i = " + i);
        if(i!=arr.length-1) {
            if((arr[i]>arr[i+1])) {
                System.out.println("Inside 1st condition");
                arr[i] = arr[i+1];
                System.out.println(arr[i]);
            } else if(arr[i]<arr[i+1]) {
                System.out.println("Inside 2nd condition");
                arr[i] = -1;
                System.out.println(arr[i]);
            } else if(arr[i]==arr[i+1]) {
                System.out.println("Inside 2nd condition");
                arr[i] = -1;
                System.out.println(arr[i]);
        } else {
            System.out.println("Inside 3rd condition");
            arr[i] = -1;
            System.out.println(arr[i]);
        }
        i++;
    }
       System.out.println(arr);
    }
}
}