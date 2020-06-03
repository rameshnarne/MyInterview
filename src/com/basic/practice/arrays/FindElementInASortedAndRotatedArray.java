package com.basic.practice.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindElementInASortedAndRotatedArray {

    public int findIndexOfElement(int[] inputArray, int numToFind){
        return Arrays.stream(inputArray) 					// IntStream
                .boxed()						// Stream<Integer>
                .collect(Collectors.toList())   // List<Integer>
                .indexOf(numToFind);
    }

    public static void main(String a[]){
        FindElementInASortedAndRotatedArray array = new FindElementInASortedAndRotatedArray();
        int output = array.findIndexOfElement(new int[]{12,313,33,45,34,3,11}, 3);
        System.out.println("Index of an element from an Array:"+ output);
    }
}
