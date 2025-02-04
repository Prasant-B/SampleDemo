package JavaConcepts;
public class ConstructorIllustration {
    
    int x;
    int y;

    ConstructorIllustration() {
        System.out.println("No arg constructor invoked");
    }

    ConstructorIllustration(int x, int y) {
        this.x= x;
        this.y = y;
        System.out.println("The nos are " + x + " " + y);
    }

    void print() {
        System.out.println("Method invoked");
    }

    public static void main(String[] args) {
        ConstructorIllustration obj = new ConstructorIllustration();
        obj.print();
        ConstructorIllustration obj1 = new ConstructorIllustration(10, 100);
        obj1.print();
    }
}
