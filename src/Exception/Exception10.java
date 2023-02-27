//package Exception;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//
//    class Base1 {
//        Base1() throws IOException {
//            System.out.print(1);
//        }
//    }
//
//    class Derived1 extends Base1 {
//        Derived1() throws FileNotFoundException {  //CE : Compilation Error occur
//            System.out.print(2);
//        }
//    }
//
//    public class Exception10 {
//        public static void main(String[] args) throws Exception {
//            new Derived1();
//        }
//
//}
