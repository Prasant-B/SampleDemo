package JavaConcepts;
public class MethodOverloadTest {
    void m1(MethodOverloadParent mop) {
        System.out.println("From Parent");
    }
    void m1(MethodOverloadChild moc) {
        System.out.println("From Child");
    }

    public static void main(String[] args) {
        MethodOverloadTest obj = new MethodOverloadTest();
        obj.m1(new MethodOverloadParent());
        obj.m1(new MethodOverloadChild());
        MethodOverloadParent obj1 = new MethodOverloadChild();
        obj.m1(obj1);
    }
}
