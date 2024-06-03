package Threading;

public class CustomizedThread extends Thread{
   // These threds are running one by one, because not creating our own thread : sequentional execution
    public void run(){
        System.out.println("Run method stated......");
    }

    public static void main(String[] args) {
        System.out.println("Main Thread Started.....");
        Thread thread = Thread.currentThread();
        System.out.println(thread);

        CustomizedThread customizedThread = new CustomizedThread();
        customizedThread.run();
        System.out.println("Main Thread Ended.....");

    }
}
