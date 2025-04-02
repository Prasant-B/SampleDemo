package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AbsoluteDifferenceOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        getDigitDiff1AndLessK(arr, k);
        sc.close();
    }

    public static ArrayList<Integer> getDigitDiff1AndLessK(int[] arr, int k) {
        ArrayList<Integer> res_al = new ArrayList<>();
        int i = 0;
        while(i<arr.length) {
            if(arr[i]<k) {
                String st = "";
                st = Integer.toString(arr[i]);
                int j = 0;
                char[] ch = st.toCharArray();
                int count = 0;
                if(st.length()>1) {
                    while(j<ch.length-1) {
                        if(Math.abs(ch[j]-ch[j+1])==1) {
                            count++;
                        }
                        j++;
                    }
                    if(count == ch.length-1) {
                        res_al.add(arr[i]);
                    }
                }
            }
            i++;
        }
        System.out.println(res_al);
        return res_al;
    }
}
