package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java1D2DArrays {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number " + "of rows of the matrix"); 
        System.out.println("Enter the number " + "of columns of the matrix"); 
        n = sc.nextInt(); 
        int arr2d[][] = new int[n][n];
        System.out.println("Enter the elements of the matrix"); 
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        int[] arr = new int[n];
        for(int k=0;k<n;k++) {
            arr[k] = sc.nextInt();
        }
        array(arr2d, arr, n);
        sc.close(); 
    }

    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        int sum = 0;
        Arrays.sort(b);
        for(int y: b) {
            al1.add(y);
        }
        System.out.println(al1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) {
                    sum = sum + a[i][j];
                }
            }
        }
        al.add(sum);
        al.add(al1.get(n-1));
        System.out.println(al);
        return al;
    }
}
