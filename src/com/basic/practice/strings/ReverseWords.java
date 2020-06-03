package com.basic.practice.strings;

public class ReverseWords {

    public String reverseWords(String input){
        String[] arr = input.split(" ");
        int iteration = arr.length/2;
       for(int j=0; j<iteration; j++){
            String temp = arr[j];
            arr[j] = arr[arr.length-1-j];
            arr[arr.length-1-j] = temp;
        }
        return String.join(" ", arr);
    }

    public String reverseWordsRecursively(String input){
        if (input == null ) return input;
        int index = input.indexOf(" ");
        return index < 0 ? input : reverseWordsRecursively(input.substring(index+1)) +" "+ input.substring(0, index);
    }

    public static void main(String a[]){
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWordsRecursively("I love you Cherry"));
    }
}
