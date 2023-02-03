package MethodReference;

import InnerClass.Test;

public class MSDemo1 {

    public void m1(){
        for (int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        MSDemo1 msDemo1= new MSDemo1();

        Runnable runnable= msDemo1::m1;

        Thread thread= new Thread(runnable);
        thread.start();

        for (int i=0; i<10; i++){
            System.out.println("Main Thread");
        }
    }

}
