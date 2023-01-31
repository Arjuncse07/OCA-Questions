package InnerClass;
class PopCorn{
    public void taste(){
        System.out.println("Salty");
    }
}


public class Test6 {
    public static void main(String[] args) {
        // we are creating a object which is having parent refrence
        PopCorn popCorn= new PopCorn()
        {
          public void taste(){
              System.out.println("spicy");
          }
        };
        popCorn.taste();

        PopCorn popCorn1= new PopCorn();
        popCorn1.taste();

        PopCorn popCorn2= new PopCorn()
        {
          public void taste(){
              System.out.println("More Spicy");
          }
        };
       popCorn2.taste();
        System.out.println(popCorn.getClass().getName()); //InnerClass.Test6$1
        System.out.println(popCorn1.getClass().getName()); //InnerClass.PopCorn
        System.out.println(popCorn2.getClass().getName()); //InnerClass.Test6$2
    }
}
