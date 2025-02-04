package JavaConcepts;
public class MethodOverload3 {
    void m1(String s) {
        System.out.println("string arg method");
    }
       
    void m1(Object o) {
        System.out.println("object arg method");
    }

    void m1(Integer i) {
        System.out.println("integer arg method");
    }

    public static void main(String[] args) {
        // MethodOverload3 obj = new MethodOverload3();
        // obj.m1(10);
        // obj.m1("10");
        // obj.m1(true);
        // obj.m1(null);
    }
}
