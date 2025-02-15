package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhoWinsMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        majorityWins(arr, n, x, y);
        sc.close();
    }

    public static int majorityWins(int arr[], int n, int x, int y) {
       Arrays.sort(arr); 
       int count1 = 0, count2 = 0;
       int i = 0;
       while(i<n) {
        if(arr[i]==x) {
            count1++;
        } else if(arr[i]==y) {
            count2++;
        }
        i++;
       }
       if(count1>count2) {
        return x;
       } else if(count1<count2){
        return y;
       } else {
        if(x<y) {
            return x;
        } else {
            return y;
        }
       }
    }
}
