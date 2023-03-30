package com.arjun.Udemy.OCAQuestions;


    class A { }
    class B extends A { }
    class Test1 {
        public static void main(String[] args) {
            A[] a1 = {};
            A[] a2 = a1;
            B[] b = {};
            a1 = b;               // Line t1
            b = (B[]) a1;         // Line t2
            b = (B[]) a2;         // Line t3
        }
    }
