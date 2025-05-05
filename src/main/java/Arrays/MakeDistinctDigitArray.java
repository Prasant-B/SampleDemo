package Arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class MakeDistinctDigitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        common_digits(arr);
        sc.close();
    }

    public static int[] common_digits(int[] nums)
    {
        TreeSet<Integer> al = new TreeSet<>();
        int i = 0;
        while(i<nums.length) {
            String st = String.valueOf(nums[i]);
            char[] ch_arr = st.toCharArray();
            for(int k=0; k<ch_arr.length; k++) {
                System.out.print(ch_arr[k]+ " ");
            }
            int j = 0;
            while(j<ch_arr.length) {
                al.add(ch_arr[j]-'0');
                j++;
            }
            System.out.println(al);
            i++;
        }
        System.out.println(al);
        int[] res = al.stream().mapToInt(Number::intValue).toArray();
        return res;
    }
}
