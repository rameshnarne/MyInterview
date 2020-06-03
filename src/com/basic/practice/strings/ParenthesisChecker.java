package com.basic.practice.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParenthesisChecker {

    public boolean isBalancedString(String s){
        if(s.length()%2 != 0) return false;

        Stack<Character> stack = new Stack();
        Map<Character,Character> mp = new HashMap() {
            {
                put('(',')');
                put('[',']');
                put('{','}');
            }
        };

        for(char ch : s.toCharArray()){
            if(mp.containsKey(ch)){
                stack.push(ch);
            }else if(mp.containsValue(ch)){
                if(stack.isEmpty() || mp.get(stack.pop()) != ch){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String a[]){
        ParenthesisChecker checker = new ParenthesisChecker();
        System.out.println(checker.isBalancedString("}[]}"));
        System.out.println(checker.isBalancedString("{[]}"));
        System.out.println(checker.isBalancedString("){[]}"));
        System.out.println(checker.isBalancedString("({[]})"));
        System.out.println(checker.isBalancedString("[(])"));
    }
}
