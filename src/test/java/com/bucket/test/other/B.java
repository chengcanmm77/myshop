package com.bucket.test.other;

public class B extends A {

    public B() {
        super();
        print();
    }

    public void print() {
        System.out.println("I am b");
    }

    public static void main(String[] args) {
        System.out.println("==");
        new B();
        
       System.gc();
    }

}
