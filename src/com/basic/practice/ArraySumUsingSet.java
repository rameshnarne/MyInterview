package com.basic.practice;

import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {

    public static void main(String a[]){
        printPairsUsingSet(new int[]{8, 0, 14, 0, 0, 4, 7, 3, 5, 7}, 0);
    }

    public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }
        Set set = new HashSet<>(numbers.length);
        for(int value : numbers){
            int target = n - value;
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
}
