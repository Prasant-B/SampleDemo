public class Swapping_2_variables {

    public static void swapping (int a, int b) {
        System.out.println("Before swapping " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping " + a + " " + b);
    }

    public static void main(String[] args) {
        swapping(10,100);
    }
}
