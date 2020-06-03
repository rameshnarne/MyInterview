package com.basic.practice;

import java.util.Arrays;

public class MaximumMinimumArrayDemo {

    public static void main(String a[]){
        findLargestAndSmallest(new int[]{-20,10,8,15,30,21});
    }

    public static void findLargestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + largest);
        System.out.println("Smallest number in array is : " + smallest);
    }
}
