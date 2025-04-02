package Arrays;

import java.util.Scanner;

public class TypeOfArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        maxNtype(arr);
        sc.close();
    }

    static int maxNtype(int arr[]) {
        int i = 0;
        if(arr[0]-arr[arr.length-1] == -(arr.length-1) || arr[0]-arr[arr.length-1] == -(arr.length)) {
            i = 1;
        } else if(arr[0]-arr[arr.length-1] == (arr.length-1) || arr[0]-arr[arr.length-1] == (arr.length)) {
            i = 2;
        } else if(arr[0]-arr[arr.length-1] >= -1) {
            i = 3;
        } else if(arr[0]-arr[arr.length-1] <= 1) {
            i = 4;
        }
        return i;  
    }
}
