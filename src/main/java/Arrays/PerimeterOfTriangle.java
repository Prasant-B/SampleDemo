package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        maxPerimeter(arr);
        sc.close();
    }

    public static int maxPerimeter(int[] arr) {
        int perimeter = 0;
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        int x = 0;
        while(x<arr.length-2) {
            System.out.println("Sides are " + arr[x] + " " + arr[x+1] + " " + arr[x+2]);
            System.out.println("Value of x is " + x);
            if(arr[x+2]>arr[x]+arr[x+1]) {
                System.out.println("Inside 1st block");
                perimeter = -1;
            } else if(arr[x+2]<=arr[x]+arr[x+1]) {
                System.out.println("Inside 2nd block");
                perimeter = arr[x] + arr[x+1] + arr[x+2];
                al.add(perimeter);
            }
            x++;
        }
        Collections.sort(al);
        if(al.size()>0) {
            perimeter = al.get(al.size()-1);
        }
        System.out.println(al);
        System.out.println(perimeter);
        return perimeter;
    }
}
