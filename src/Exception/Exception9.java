package Exception;

import java.util.List;

public class Exception9 {


    class A{}
    class B extends A{}

    abstract class Super {
        abstract List<A> get() throws IndexOutOfBoundsException;
    }

    abstract class Sub extends Super {
        abstract  List<A> get() throws  ArrayIndexOutOfBoundsException;
    }


}
