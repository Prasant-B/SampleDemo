package Arrays;

import java.util.Scanner;

public class LastIndexOfOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        lastIndex(st);
        sc.close();
    }

    public static int lastIndex(String s) {
        return s.lastIndexOf("1");
    }
}
