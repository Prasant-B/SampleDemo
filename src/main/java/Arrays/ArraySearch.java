package Arrays;
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        arraySearchFunc(arr, x);
        sc.close();
    }

    public static int arraySearchFunc(int[] testarr, int x) {
        int index = -1;
        int i = 0;
        while(i<testarr.length) {
            if(testarr[i] == x) {
                index = i;
                break;
            }
            i++;
        }
        System.out.println(index);
        return index;
    }
}
