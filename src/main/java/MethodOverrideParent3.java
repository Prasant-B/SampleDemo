public class MethodOverrideParent3 {
    void m1() throws Exception{
        System.out.println("From Parent exception thrown");
    }

    void m2() throws Exception{
        System.out.println("From Parent exception thrown for m2");
    }

    public static void m3() {
        System.out.println("From Parent class illustration of method hiding");
    }
}
