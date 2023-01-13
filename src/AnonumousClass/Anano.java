package AnonumousClass;
/*
Anonymous class is always a inner class.
It is also a sub class of the another class.
 */

class Greetings{
    public void sayHello(){
        System.out.println("Hello");
    }
}


//outer class
class America{
     //anonymous inner class
    //instance of the anonymous class is created
    Greetings grt =new Greetings() {
     public void sayHello(){
         System.out.println("Anonymous class method");
     }
    };
}


public class Anano {

    public static void main(String[] args) {
      America america= new America();
      america.grt.sayHello();
    }
}
