public class MethodOverrideChild2 extends MethodOverrideParent2 {
    protected void m1() {
        System.out.println("From child protected type modifier");
    }
    public void m2() {
        System.out.println("From child public type modifier");
    }

    public static void main(String[] args) {
        MethodOverrideParent2 obj = new MethodOverrideChild2();
        obj.m1();
        obj.m2();
        MethodOverrideParent2 obj1 = new MethodOverrideParent2();
        obj1.m1();
        obj1.m2();
    }
}
