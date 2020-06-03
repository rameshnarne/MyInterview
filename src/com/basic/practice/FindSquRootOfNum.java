package com.basic.practice;

public class FindSquRootOfNum {

    static int findSquRoot(int num){

        if (num == 0 || num == 1)
            return num;

        int start = 1, end = num, ans = 0;

        while (start <= end){
            int mid = (start + end) / 2;

            if(mid*mid == num)
                return mid;
            else if (mid*mid < num) {
                start = mid + 1;
                ans = mid;
            } else
                end = mid - 1;
        }
        return ans;
    }

    public static void main(String a[]){
        int squRoot = findSquRoot(525);
        System.out.println("Squ Root:"+ squRoot);
    }
}
