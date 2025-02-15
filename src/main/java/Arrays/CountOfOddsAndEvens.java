package Arrays;

import java.util.Scanner;

public class CountOfOddsAndEvens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        countOddEven(arr);
        sc.close();
    }

    public static int[] countOddEven(int[] arr) {
       int[] res = new int[2];
       int i = 0;
       int even = 0, odd = 0;
       while(i<arr.length) {
        if(arr[i]%2==0) {
            even++;
        } else {
            odd++;
        }
        i++;
       }
       res[0] = odd;
       res[1] = even;
       return res;
    }
}
