package StaticControlFlow;
/*
Static Control Flow Parent Child Relationship
 */
class Base{
   static int i=10;
   static {
      m1();
      System.out.println("Base static Block");
   }

   public static void main(String[] args) {
      System.out.println(j);
   }
   public static void m1(){
      System.out.println(j);
   }
   static int j=20;
}

public class SCF_2 extends Base {
   static  int x=100;
   static {
      m2();
      System.out.println("Derived First Static Block");
   }

   public static void main(String[] args) {
      System.out.println(y);
   }
   public static void m2(){
      System.out.println(y);
   }

   static {
      System.out.println("Derived Second Static Block");
   }
   static int y=200;
}
