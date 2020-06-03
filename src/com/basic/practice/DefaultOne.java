package com.basic.practice;

public interface DefaultOne {
    public default void print(){
        System.out.println("From Default One");
    }
}
