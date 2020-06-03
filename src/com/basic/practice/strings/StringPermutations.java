package com.basic.practice.strings;

public class StringPermutations {

    private void permutations(String perm, String input){
        if (input.isEmpty()) {
            System.out.println(perm + input);
        } else {
            for (int i=0;i<input.length();i++) {
                permutations(perm + input.charAt(i),
                        input.substring(0, i) + input.substring(i+1, input.length()));
            }
        }

    }

    public static void main(String a[]){
        StringPermutations permutations = new StringPermutations();
            permutations.permutations("", "ABCD");

    }
}
