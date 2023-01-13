package AnonumousClass;

class Russia{
    public void sayHello(){
        System.out.println("Hey how's you");
    }
}
class Sumit{
   Russia russia=new Russia(){
        public void sayHello(){
            System.out.println("Hello From anonymous class");
        }
    };
}
public class MyAnnonCls {
    public static void main(String[] args) {
        Sumit sumit= new Sumit();
        sumit.russia.sayHello();
    }
}
