package dev.dias375;

import java.util.Stack;

public class ReverseString {

    public ReverseString() {
    }

    public String run (String value){

        if(value == null) throw new IllegalArgumentException();

        StringBuilder reverse = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : value.toCharArray()){
            stack.push(c);
        }

        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
