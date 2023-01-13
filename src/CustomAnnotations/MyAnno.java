package CustomAnnotations;
//Creating Custom Annotations in Java
/*
ElementType.TYPE= means annotations will be used on class, enum,method
RetentionPolicy.RUNTIME= means annotations will be available to the java compiler and JVM.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    int myValue() default 0;

    String name() default "Arjun";
    String city() default "Delhi";
    int age() default 24;
}