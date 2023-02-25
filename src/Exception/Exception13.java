//package Exception;
//
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//abstract class Super1 {
//    public abstract void m1() throws IOException;
//}
//
//class Sub1 extends Super1 {
//    @Override
//    public void m1() throws IOException {
//        throw new FileNotFoundException();
//    }
//}
//
//public class Exception13 {
//    public static void main(String[] args) {
//        Super1 s = new Sub1();
//        try {
//            s.m1();
//        } catch (IOException e) {
//            System.out.print("A");
//        } catch(FileNotFoundException e) {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//    }
//
