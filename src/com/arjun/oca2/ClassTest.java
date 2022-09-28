package com.arjun.oca2;
import com.arjun.oca2.IncTest;
class Message {
    static void main(String [] args) {
        System.out.println("Welcome " + args[2] + "!");
    }
}
public class ClassTest {
    protected static void main(String[] args) {
        Message.main(args);
    }
}
