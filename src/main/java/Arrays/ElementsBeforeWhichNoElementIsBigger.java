package Arrays;

import java.util.Scanner;

public class ElementsBeforeWhichNoElementIsBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        countElements(arr);
        sc.close();
    }

    public static int countElements(int[] arr) {
        int count = 1;
        int max = arr[0];
        int i = 1;
        while(i<arr.length) {
            if(arr[i]>max) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }
}
