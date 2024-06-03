package Threading;

public class ThreadDemo {

    public static void main(String[] args) {
       // Main thread , created by JVM to run java programs
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
    }

}
