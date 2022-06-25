package com.arjun.oca;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract  class Super{
    public  abstract  void m1() throws IOException;
}
class  Sub extends  Super{
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}
public class Class3 {
    public static void main(String[] args) {
        Super s= new Sub();
        try{
            s.m1();
        }catch (IOException e){
            System.out.print("M");
        }finally {
            System.out.print("N");
        }
    }
}
