package com.basic.practice;

public class DefaultTest implements DefaultOne, DefaultTwo {

    public void print(){
        DefaultOne.super.print();
    }

    public static void main (String a[]){
        System.out.println("Default Test");
       new DefaultTest().print();
    }
}
