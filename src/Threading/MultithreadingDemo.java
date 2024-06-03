package Threading;

public class MultithreadingDemo extends Thread {

    public void run(){
        System.out.println(" ArjunThread started ....");
        m1();
        System.out.println(" Arjun Thread completed ....");
    }

    public void m1(){
        System.out.println("Run method executed .....");
    }


    public static void main(String[] args) {
        System.out.println("Thread started .......");
        Thread currentThread = Thread.currentThread();
        String threadName = currentThread.getName();
        System.out.println(currentThread);

        MultithreadingDemo multithreadingDemo = new MultithreadingDemo();
        multithreadingDemo.m1();

        Thread thread = new Thread(multithreadingDemo);
        thread.start(); //internally call run() method

        System.out.println( threadName + " Thread Completed .......");



    }
}
