public class MethodOverrideChild extends MethodOverrideParent {
    void m1() {
        System.out.println("From Child");
    }

    public static void main(String... args) {
        MethodOverrideChild obj = new MethodOverrideChild();
        obj.m1();
        MethodOverrideParent obj1 = new MethodOverrideParent();
        obj1.m1();
        MethodOverrideParent obj2 = new MethodOverrideChild();
        obj2.m1();
    }
}
