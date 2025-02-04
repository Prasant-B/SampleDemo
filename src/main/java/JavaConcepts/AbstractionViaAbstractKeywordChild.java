package JavaConcepts;
public abstract class AbstractionViaAbstractKeywordChild extends AbstractionViaAbstractKeywordParent {

    public void m1() {
        System.out.println("Overriding method 'm1'");
    }
    @Override
    public void m2() {
        System.out.println("Unimplemented method 'm2'");
    }

    public static void main(String[] args) {
        // AbstractionViaAbstractKeywordParent obj = new AbstractionViaAbstractKeywordChild();
        // obj.m1();
        // obj.m2();
    }
}
