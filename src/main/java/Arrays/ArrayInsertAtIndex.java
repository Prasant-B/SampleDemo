package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayInsertAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int element = sc.nextInt();
        insertAtIndex(arr, sizeOfArray, index, element);
        sc.close();
    }

    public static void insertAtIndex(int arr[],int sizeOfArray,int index, int element)
    {
        List<Integer> al = new ArrayList<Integer>();
        for(int k : arr)
            al.add(k);
        al.add(index, element);
        for(int j: al) {
            System.out.print(j + " ");
        }
    }
}
