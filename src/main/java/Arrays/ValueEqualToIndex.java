package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValueEqualToIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i: arr) {
            al.get(i);
        }
        valueEqualToIndex(al);
        sc.close();
    }
        
    public static List<Integer> valueEqualToIndex(ArrayList<Integer> nums) {
        Integer[] arr1 = new Integer[nums.size()];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.size(); i++) {
            arr1[i] = nums.get(i);
        }
        int i = 0;
        while(i<arr1.length) {
            if(arr1[i]==(i+1)) {
                res.add(arr1[i]);
            }
            i++;
        }
        return res;
    }
}