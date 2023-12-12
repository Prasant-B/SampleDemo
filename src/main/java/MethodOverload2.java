public class MethodOverload2 {
    void m1(int i) {
        System.out.println("int arg method");
    }
       
    void m1(float f) {
        System.out.println("float arg method");
    }

    public static void main(String[] args) {
        // MethodOverload2 obj = new MethodOverload2();
        // obj.m1(10);
        // obj.m1(10.5f);
        // obj.m1(100l);
        // obj.m1('a');
        // obj.m1(10.5d);
    }
}
