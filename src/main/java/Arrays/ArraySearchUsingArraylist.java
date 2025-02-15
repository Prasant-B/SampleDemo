package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArraySearchUsingArraylist {
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
        int x = sc.nextInt();
        search(x,al);
        sc.close();
    }

    public static int search(int k, ArrayList<Integer> arr) {
        int index = -1;
        int i = 0;
        while(i<arr.size()) {
            if(arr.get(i).intValue() == k) {
                index = i;
                break;
            }
            i++;
        }
        System.out.println(index);
        return index;
    }
}
