package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FibonacciInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        countFibonacciNumbers(arr);
        sc.close();
    }

    public static int countFibonacciNumbers(long[] arr) {
        int count = 0;
        Arrays.sort(arr);
        long last_ele = arr[arr.length - 1];
        System.out.println("Last element is " + last_ele);
        long a = 0;
        long b = 1;
        long c = 0;
        ArrayList<Long> al = new ArrayList<>();
        al.add(a);
        al.add(b);
        while(c<=last_ele) {
            c = a + b;
            al.add(c);
            a = b;
            b = c;
        }
        System.out.println(al);
        long[] fibo_arr = new long[al.size()];
        for(int i = 0; i < fibo_arr.length; i++) {
            fibo_arr[i] = al.get(i);
        }
        int x = 0;
        while(x<arr.length) {
            int y = 0;
            while (y<fibo_arr.length) {
                if(arr[x] == fibo_arr[y]) {
                    count++;
                    break;
                }
                y++;
            }
            x++;
        }
        System.out.println("Count is " + count);
        return count;
    }
}
