package JavaConcepts;
public class AbstractionViaAbstractKeywordGrandChild extends AbstractionViaAbstractKeywordChild{
    
    public void m1() {
        System.out.println("Overriding method 'm1'");
    }
    @Override
    public void m2() {
        System.out.println("Unimplemented method 'm2'");
    }
    @Override
    public void m3() {
        System.out.println("Unimplemented method 'm3'");
    }

    public static void main(String[] args) {
        AbstractionViaAbstractKeywordParent obj = new AbstractionViaAbstractKeywordGrandChild();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
