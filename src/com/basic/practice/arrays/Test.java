package com.basic.practice.arrays;

public class Test {

    public static void main(String a[]) {
        int i=2; int j=0;
        /*int temp = (i++ + i++);
        int temp1 = --i;*/
       j = (i++ + i++)*--i;
        System.out.println(j);
    }

}
