package Arrays;

import java.util.Scanner;

public class Replace0sWith5s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int num = Integer.parseInt(st);
        convertfive(num);
        sc.close();
    }

    static int convertfive(int num) {
        String st = Integer.toString(num);
        int i = 0;
        while(i<st.length()) {
            System.out.println("Index is " + i);
            if(st.charAt(i)=='0') {
                System.out.println("Entered " + st.charAt(i));
                st= st.replace('0', '5');
            }
            i++;
        }
        System.out.println(st);
        num = Integer.parseInt(st);
        return num;
    }
}
