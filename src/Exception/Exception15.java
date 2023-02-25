//package Exception;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//abstract class Super2 {
//    public abstract void m1() throws IOException;
//}
//
//class Sub2 extends Super2 {
//    @Override
//    public void m1() throws IOException {
//        throw new FileNotFoundException();
//    }
//}
//
//public class Exception15 {
//    public static void main(String[] args) {
//        Super2 s = new Sub2();
//        try {
//           // s.m1();
//        } catch (FileNotFoundException e) {
//            System.out.print("M");
//        } finally {
//            System.out.print("N");
//        }
//    }
//}
