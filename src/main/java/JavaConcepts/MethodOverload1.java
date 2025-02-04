package JavaConcepts;
public class MethodOverload1 {
    
   void m1() {
    System.out.println("No arg method");
   }

   void m1(int i) {
    System.out.println("int arg method");
   }
   
   void m1(float f) {
    System.out.println("float arg method");
   }

   void m1(float f, int i) {
    System.out.println("float arg followed by int arg method");
   }

   void m1(int i, float f) {
    System.out.println("int arg followed by float arg method");
   }

   void m1(int i1, int i2) {
    System.out.println("int arg followed by int arg method");
   }

   public static void main(String[] args) {
    MethodOverload1 obj = new MethodOverload1();
    obj.m1();
    obj.m1(10);
    obj.m1(10.0f);
    obj.m1(10, 100);
    obj.m1(10.0f, 10);
    obj.m1(10, 10.0f);
   }
}
