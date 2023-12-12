public class MethodOverrideChild1 extends MethodOverrideParent1 {
    public Float m1() {
        System.out.println("From Child float return type");
        return 10.0f;
    }

    public static void main(String[] args) {
        MethodOverrideParent1 obj = new MethodOverrideChild1();
        obj.m1();
        MethodOverrideParent1 obj1 = new MethodOverrideParent1();
        obj1.m1();
    }
}
