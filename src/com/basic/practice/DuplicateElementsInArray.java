package com.basic.practice;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElementsInArray {

    public static void main(String []args){
        findDuplicateElementsInArray(new int[]{2,4,5,4,6,8,10,2,2});

        findDuplicateElementsInArrayDiffWay(new int[]{2,4,5,4,6,8,10,2,10,10});
    }

    public static void findDuplicateElementsInArray(int[] array){
        HashSet<Integer> numSet = new HashSet<>();
        for (int number: array) {
            if (!numSet.add(number)){
                System.out.println("Duplicate Number:"+ number);
            }
        }
        System.out.println("Unique Number List:"+ numSet);
    }

    public static void findDuplicateElementsInArrayDiffWay(int[] array){

        Arrays.sort(array);
        int previous = array[0];

        for (int i=1; i < array.length; i++){
            int current = array[i];
            if(previous == current)
                System.out.println("Duplicate Element:" + current);

            previous = array[i];
        }
    }
}
