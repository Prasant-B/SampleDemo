package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndSecondSmallests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        minAnd2ndMin(arr);
        sc.close();
    }

    public static int[] minAnd2ndMin(int arr[]) {
        int[] res_arr = new int[2];
        Arrays.sort(arr);
        res_arr[0] = arr[0];
        int i = 1;
        int count = 0;
        while(i<arr.length) {
            if(res_arr[0]<arr[i]) {
                res_arr[1] = arr[i];
                break;
            } else if(res_arr[0] == arr[i]) {
                count++;
            }
            i++;
        }
        if(count==arr.length-1) {
            res_arr[0] = -1;
        }
        return res_arr;
    }
}
