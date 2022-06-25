package com.arjun.oca;
import java.util.ArrayList;
class Counter{
    int count;
    Counter(int count){
        this.count=count;
    }
    @Override
    public String toString() {
        return "Counter [count=" + count + "]";
    }
}


public class Class1 {

    public static void main(String[] args) {

        ArrayList<Counter> original= new ArrayList<Counter>();
        original.add(new Counter(10));

        ArrayList<Counter> cloned= (ArrayList<Counter>)original.clone();
        cloned.get(0).count=5;

        System.out.println(original);
        System.out.println(cloned);

    }
}
