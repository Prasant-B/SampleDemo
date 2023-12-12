public class InheritanceIllustrationParent {

    public void m1() {
        System.out.println("Public method from Parent");
    }

    void m2() {
        m3();
        System.out.println("Default method from Parent");
    }

    private void m3() {
        System.out.println("Private method from Parent");
    }

    protected void m4() {
        System.out.println("Protected method from Parent");
    }
}
