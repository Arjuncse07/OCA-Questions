package Threading;

public class RunnableDemo implements Runnable{


    @Override
    public void run() {
        System.out.println("run method started....");

        Thread thread = Thread.currentThread();
        System.out.println(">>>> "+thread);

        System.out.println("run method ended.....");
    }

    public static void main(String[] args) {

    RunnableDemo runnableDemo = new RunnableDemo();
    Thread t = new Thread(runnableDemo);
    System.out.println(">>>> "+t.getName());

    t.start(); //thread start method
    //t.run();  // call run method explicitely.....




    }

}
