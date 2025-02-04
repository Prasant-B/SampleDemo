package JavaConcepts;
public class SpecialCasesInConstructors2 {
    
    SpecialCasesInConstructors2() {
        this(10);
        System.out.println("No arg constructor");
    }
 
    SpecialCasesInConstructors2(int x) {
        this(10.5d);
        System.out.println("Int arg constructor");
    }

    SpecialCasesInConstructors2(double x) {
        super();
        System.out.println("Double arg constructor");
    }

    void SpecialCasesInConstructors2() {
        System.out.println("I am invoked");
    }

    public static void main(String[] args) {
        SpecialCasesInConstructors2 obj = new SpecialCasesInConstructors2();
        obj.SpecialCasesInConstructors2();
    }
}
