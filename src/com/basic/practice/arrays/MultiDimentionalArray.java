package com.basic.practice.arrays;

public class MultiDimentionalArray {

    public static void main(String a[]){
        int[][] intArray = {{2,3,4},{5,34,5},{2,32,41}};

        for(int i=0; i < intArray.length; i++){
            for (int j=0; j< intArray.length; j++){
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
