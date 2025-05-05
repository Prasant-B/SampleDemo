package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElementRepeatingKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findDuplicate(arr, k);
        sc.close();
    }

    public static int findDuplicate(int[] arr, int k) {
        Arrays.sort(arr);
        for(int a: arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        int i = 0;
        int min = -1;
        while(i<arr.length) {
            int count = 1;
            while(i+1<arr.length && arr[i]==arr[i+1]) {
                count++;
                i++;
            }
            System.out.println(arr[i] + " occurs " + count + " times");
            if(count == k && min==-1) {
                min = arr[i];
            }
            i++;
        }
        System.out.println("Min is " + min);
        return min;
    }
}
