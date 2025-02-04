package JavaConcepts;
import java.io.IOException;

public class MethodOverrideChild3 extends MethodOverrideParent3 {
    void m1() {
        System.out.println("From child no exception thrown");
    }

    protected void m2() throws IOException {
        System.out.println("From child IO exception thrown");
    }

    public static void m3() {
        System.out.println("From Child class illustration of method hiding");
    }

    public static void main(String[] args) throws Exception {
        MethodOverrideParent3 obj = new MethodOverrideChild3();
        obj.m1();
        obj.m2();
        m3();
        MethodOverrideParent3 obj1 = new MethodOverrideParent3();
        obj1.m1();
        obj1.m2();
        m3();
    }
}
