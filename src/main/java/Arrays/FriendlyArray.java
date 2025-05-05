package Arrays;

import java.util.Scanner;

public class FriendlyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        calculateFriendliness(arr);
        sc.close();
    }

    public static int calculateFriendliness(int[] arr) {
        int sum = 0;
        int i = 0;
        while(i<arr.length) {
            if(i!=(arr.length-1)) {
                sum = sum + Math.abs(arr[i] - arr[i+1]);
            } else if(i == (arr.length-1)) {
                sum = sum + Math.abs(arr[i] - arr[0]);
            }
            i++;
        }
        return sum;
    }
}
