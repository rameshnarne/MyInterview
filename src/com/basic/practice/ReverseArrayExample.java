package com.basic.practice;

import java.util.Arrays;

public class ReverseArrayExample {

    public static void main(String a[]){
        int[] iArray = new int[] {101,102,103,104,105};
        String[] sArray = new String[] {"one", "two", "three", "four", "five"};
        reverseArray(sArray);


    }

    public static void reverseArray(Object[] array){

        int length = array.length;
        Object[] resultArray = new Object[length];
        int index = length;
        for (int i=0; i<length; i++){
            resultArray[i] = array[index-1];
            index --;
        }

        System.out.println("Result Array:" + Arrays.toString(resultArray));
    }
}
