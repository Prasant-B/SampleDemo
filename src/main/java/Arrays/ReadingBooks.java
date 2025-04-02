package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            arr2[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        maxPoint(k, arr1, arr2);
        sc.close();
    }

    public static int maxPoint(int k, int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length];
        int i = 0;
        while(i<arr1.length) {
            int count = 0;
            int res = 0;
            while(k>=count) {
                count = count + arr1[i];
                if(count>k) {
                    break;
                }
                System.out.println("Total Minutes for " + arr1[i] + " " + count);
                res = res + arr2[i];
                System.out.println("Max points for " + arr2[i] + " " + res);
            }
            arr[i] = res;
            i++;
        }
        Arrays.sort(arr);
        for(int a: arr) {
            System.out.print(a + " ");
        }
        return arr[arr.length-1];
    }
}
