package com.basic.practice.strings;

public class StringReverseExample {

    public static void main(String a[]){
        String output = reverseStringRecursively("My Name Is Ramesh Babu Narne. I am a Fool!");

        System.out.println("Output Recursively: "+ output);

        output = reverseStringRecursivelyDiff("My Name Is Ramesh Babu Narne. I am a Fool!");

        System.out.println("Output Recursively: "+ output);

        output = reverseStringIteratively("My Name Is Ramesh Babu Narne. I am Unlucky guy!");

        System.out.println("Output Iteratively: "+ output);
    }


    public static String reverseStringRecursively(String inputStr){

        if(inputStr.length() < 2)
            return inputStr;

        return reverseStringRecursively(inputStr.substring(1)) + inputStr.charAt(0);

    }

    public static String reverseStringRecursivelyDiff(String inputStr){

        if(inputStr.length() < 2)
            return inputStr;

        char[] arr = inputStr.toCharArray();

        for (int i=0; i< arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return String.valueOf(arr);

    }

    public static String reverseStringIteratively(String inputStr){

        if(inputStr.length() < 2)
            return inputStr;

        StringBuilder output = new StringBuilder();
        int length = inputStr.length();

        for (int i=length-1; i>=0; i--) {
            output.append(inputStr.charAt(i));
        }

        return output.toString();
    }
}
