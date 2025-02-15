package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayLongestName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        for(String st: al) {
            al.add(st);
        }
        longest(al);
        sc.close();
    }

    public static String longest(List<String> arr) {
        int i = 0;
        int count = 0;
        String st ="";
        while(i<arr.size()) {
            if(count<arr.get(i).length()) {
                count = arr.get(i).length();
                st = arr.get(i);
            }
            i++;
        }
        return st;
    }
}
