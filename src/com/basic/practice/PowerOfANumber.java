package com.basic.practice;

public class PowerOfANumber {
    int findPower(int num, int pow){
        if (pow == 0)
            return 1;
        else if (pow == 1)
            return num;
        else
            return num * findPower(num,pow-1);
    }

    public static void main(String a[]){
        PowerOfANumber power = new PowerOfANumber();
        int result = power.findPower(2,5);
        System.out.println(result);
    }
}
