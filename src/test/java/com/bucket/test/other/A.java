package com.bucket.test.other;

public class A {

    public A() {
        print1();
    }

    public void print1() {
        System.out.println("I am A");
    }

    public static void main(String[] args) {
        System.out.println(null instanceof A);
    }

}
