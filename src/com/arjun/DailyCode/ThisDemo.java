package com.arjun.DailyCode;

public class ThisDemo {
    int cakes=5;
    void  order(int cakes){
        this.cakes=cakes;
    }

    public static void main(String[] args) {
        ThisDemo thisDemo= new ThisDemo();
        thisDemo.order(10);
        System.out.println("CAKES:"+thisDemo.cakes);
    }
}
