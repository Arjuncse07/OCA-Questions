package ReflectionAPI;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Rf1 {

    public static void main(String...args) {
       try {
           Class c=Class.forName(args[0]);
           Method m[]= c.getDeclaredMethods();
           System.out.println("Methods are ");
           for (Method mm:m) {
               System.out.println(mm);
           }

           Field fields[] = c.getDeclaredFields();
           System.out.println("Fields are ");
           for (Field ff:fields) {
               System.out.println(ff);
           }

           Constructor constructor[]= c.getConstructors();
           System.out.println("Constructors are");
           for (Constructor cons:constructor) {
               System.out.println(cons);
           }

       }catch (Exception e){
           e.printStackTrace();
       }

    }

}
