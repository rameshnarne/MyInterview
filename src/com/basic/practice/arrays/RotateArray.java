package com.basic.practice.arrays;

import java.util.Arrays;

// Reversal Algorithm
public class RotateArray {

    public int[] rotateLeftArray(int[] input, int rotation){
        int arrayLength = input.length;
        if (rotation == 0 || rotation == arrayLength)
            return input;
        if (rotation > arrayLength)
            rotation = rotation % arrayLength;

        reverseArray(input, 0, rotation-1);
        reverseArray(input, rotation, arrayLength -1);
        reverseArray(input, 0, arrayLength -1);
        return input;
    }

    public int[] rotateRightArray(int[] input, int rotation){
        int arrayLength = input.length;
        if (rotation == 0 || rotation == arrayLength)
            return input;
        if (rotation > arrayLength)
            rotation = rotation % arrayLength;

        reverseArray(input, arrayLength - rotation, arrayLength-1);
        reverseArray(input, 0, arrayLength - rotation-1);
        reverseArray(input, 0, arrayLength -1);

        return input;
    }

    private void reverseArray(int[] array, int start, int end){
        int temp;
        while (start < end){
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String a[]){
        RotateArray array = new RotateArray();
        int[] leftOutput = array.rotateLeftArray(new int[]{1,2,3,4,5,6,7}, 2);
        System.out.println("Rotation of Array Left: "+ Arrays.toString(leftOutput));

        int[] rightOutput = array.rotateRightArray(new int[]{1,2,3,4,5,6,7}, 2);
        System.out.println("Rotation of Array Right: "+ Arrays.toString(rightOutput));
    }
}
