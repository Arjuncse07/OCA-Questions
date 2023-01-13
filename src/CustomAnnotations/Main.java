package CustomAnnotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        Devired devired= new Devired();
         Class cls = devired.getClass();

        Annotation anno=(Annotation) cls.getAnnotation(MyAnno.class);
        System.out.println(anno);
        System.out.println(cls.getName());
        System.out.println(cls);



    }
}
