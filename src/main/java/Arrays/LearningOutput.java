package Arrays;

import java.util.Scanner;

public class LearningOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextLong();
        }
        Learning(arr, n);
        sc.close();
    }

    public static void Learning(long arr[], long n)
    {
        double pos = 0, neg = 0, zero = 0;
        int i = 0;
        while(i<arr.length) {
            if(arr[i]>0) {
                pos++;
            } else if(arr[i]<0) {
                neg++;
            } else {
                zero++;
            }
            i++;
        }
        System.out.println("Positive, Negative and zero values are " + pos + " " + neg + " " + zero);
        double pos_res = 0.0, neg_res = 0.0, zero_res = 0.0;
        pos_res = (n/pos);
        neg_res = (n/neg);
        zero_res = (n/zero);
        if(pos_res==(int)pos_res) {
            System.out.printf("%.0f", (float)pos_res);
        } else {
            System.out.printf("%.5f", (float)pos_res);
        }
        System.out.println();
        if(neg_res==(int)neg_res) {
            System.out.printf("%.0f", (float)neg_res);
        } else {
            System.out.printf("%.5f", (float)neg_res);
        }
        System.out.println();
        if(zero_res==(int)zero_res) {
            System.out.printf("%.0f", (float)zero_res);
        } else {
            System.out.printf("%.5f", (float)zero_res);
        }
    }
}
