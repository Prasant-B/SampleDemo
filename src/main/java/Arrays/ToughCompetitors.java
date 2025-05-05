package Arrays;

import java.util.Scanner;

public class ToughCompetitors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) {
            arr1[i] = sc.nextInt();
        }
        minDiff(arr1);
        sc.close();
    }

    public static int minDiff(int[] arr) {
        int diff = 0;
        int i = 0;
        while(i<arr.length) {
            int j = 0;
            while(j<arr.length) {
                if(i==0&&j==1) {
                    System.out.println("In 1st block");
                    System.out.println("Values of i and j are " + i + " " + j);
                    diff = Math.abs(arr[i]-arr[j]);
                    System.out.println("Diff is " + diff);
                } else {
                    if(i!=j) {
                        if(diff>Math.abs(arr[i]-arr[j])) {
                            System.out.println("In 2.2nd block");
                            System.out.println("Values of i and j are " + i + " " + j);
                            diff = Math.abs(arr[i]-arr[j]);
                            System.out.println("Diff is " + diff);
                        }
                    }
                }
                j++;
            }
            i++;
        }
        return diff;
    }
}
