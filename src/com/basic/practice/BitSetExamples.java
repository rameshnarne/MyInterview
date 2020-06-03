package com.basic.practice;

import java.util.*;

public class BitSetExamples {

    public static void main(String[] args){
        findMissingNumbers(new int[]{2,4,5,6,11,13,14,15,18,19,20}, 20);

        findMissingNumbersThatHasDuplicateValues(new int[]{2,4,5,6,11,13,14,15,18,19,20,20}, 20);

        findUnCommonNumberFromTwoArrays(new int[]{1,2,4,5,8}, new int[]{2,6,9,1});

        findCommonNumberFromTwoArrays(new int[]{1,2,4,5,8}, new int[]{2,6,9,1});

        findAndNotCommonNumberFromTwoArrays(new int[]{1,2,4,5,8}, new int[]{2,6,9,1,8});
    }

    public static void findMissingNumbers(int[] inputArray, int maxCount){
        BitSet bitSet = new BitSet(maxCount);
        for (int number : inputArray) {
            bitSet.set(number - 1);
        }
        int missingNumberCount = maxCount - inputArray.length;
        int missingNumberIndex = 0;
        for (int i=0; i < missingNumberCount; i++) {
            missingNumberIndex = bitSet.nextClearBit(missingNumberIndex);
            System.out.println("Missing Number: "+ ++missingNumberIndex);
        }
    }

    public static void findMissingNumbersThatHasDuplicateValues(int[] inputArray, int maxCount){
        Set<Integer> uniqueElementsSet = new HashSet(Arrays.asList(inputArray));
        BitSet bitSet = new BitSet(maxCount);
        for (Integer number : uniqueElementsSet) {
            bitSet.set(number - 1);
        }
        int missingNumberCount = maxCount - inputArray.length;
        int missingNumberIndex = 0;
        for (int i=0; i < missingNumberCount; i++) {
            missingNumberIndex = bitSet.nextClearBit(missingNumberIndex);
            System.out.println("Missing Number: "+ ++missingNumberIndex);
        }
    }

    public static void findUnCommonNumberFromTwoArrays(int[] arrayOne, int[] arrayTwo){
        BitSet one = new BitSet(arrayOne.length);
        BitSet two = new BitSet(arrayTwo.length);
        for (int number : arrayOne)
            one.set(number);
        for (int number : arrayTwo)
            two.set(number);
        one.xor(two);
        System.out.println(one);
    }

    public static void findCommonNumberFromTwoArrays(int[] arrayOne, int[] arrayTwo){
        BitSet one = new BitSet(arrayOne.length);
        BitSet two = new BitSet(arrayTwo.length);
        for (int number : arrayOne)
            one.set(number);
        for (int number : arrayTwo)
            two.set(number);
        one.and(two);
        System.out.println(one);
    }

    public static void findAndNotCommonNumberFromTwoArrays(int[] arrayOne, int[] arrayTwo){
        BitSet one = new BitSet(arrayOne.length);
        BitSet two = new BitSet(arrayTwo.length);
        for (int number : arrayOne)
            one.set(number);
        for (int number : arrayTwo)
            two.set(number);
        one.andNot(two);
        System.out.println(one);
    }
}
