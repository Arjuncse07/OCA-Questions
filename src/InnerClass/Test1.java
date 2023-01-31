package InnerClass;

//Nesting of Inner Class
class Test1{

    class B{

      class C{
          public void m1(){
              System.out.println("Inside m1 method");
          }
      }

    }

    public static void main(String[] args) {
        Test1 test1= new Test1();

        Test1.B b= test1.new B();

        Test1.B.C c= b.new C();
        c.m1();
    }
}

