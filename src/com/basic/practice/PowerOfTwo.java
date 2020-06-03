package com.basic.practice;

public class PowerOfTwo {

    /* Method to check if x is power of 2*/
    static boolean isPowerOfTwo (int x)
    {
      /* First x in the below expression is
        for the case when x is 0 */
        return x!=0 && ((x&(x-1)) == 0);

    }

    static boolean isPowerOfTwoDiff(int x)
    {
      if (x == 0){
          return false;
      }

      while (x != 1){
          if (x%2 != 0){
              return false;
          }

          x = x/2;
      }

      return true;

    }

    // Driver method
    public static void main(String[] args)
    {
        System.out.println(isPowerOfTwo(31) ? "Yes" : "No");
        System.out.println(isPowerOfTwo(64) ? "Yes" : "No");
        System.out.println(isPowerOfTwoDiff(31) ? "Yes" : "No");
        System.out.println(isPowerOfTwoDiff(64) ? "Yes" : "No");


    }

}
