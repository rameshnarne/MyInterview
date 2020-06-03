package com.mustdo.practice.arrays;

import java.util.Arrays;

/**
 * Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

 Input:
 The first line of input contains an integer T denoting the number of test cases.
 Then T test cases follow. Each test case consists of two lines.
 First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

 Output:
 For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

 Constraints:
 1 <= T <= 100
 3 <= N <= 105
 1 <= A[i] <= 106

 Example:
 Input:
 2
 4
 1 5 3 2
 3
 3 2 7
 Output:
 2
 -1

 Explanation:
 Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
 */
public class CountTheTriplets {

    public static void main(String a[]) {
        CountTheTriplets obj = new CountTheTriplets();
        obj.printTheCountOfAllTriplets(new int[]{1,5,3,2});
        //obj.printTheCountOfAllTriplets(new int[]{3,2,7});
    }

    private void printTheCountOfAllTriplets(int[] arr) {
        Arrays.sort(arr);
        int tripletCount = 0;
        for(int i = arr.length-1; i >= 0; i--){
            int previous = 0;
            int next = i-1;
            while(previous < next) {
                if(arr[i] == arr[previous] + arr[next]){
                    tripletCount++;
                    previous ++;
                    next --;
                }
                else if(arr[i] > arr[previous] + arr[next])
                    previous ++;
                else
                    next --;
            }
        }
        if(tripletCount != 0)
            System.out.println(tripletCount);
        else
            System.out.println(-1);
    }
}
