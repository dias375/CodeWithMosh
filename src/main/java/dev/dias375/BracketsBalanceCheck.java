package dev.dias375;

import java.util.Stack;

public class BracketsBalanceCheck {

    private final char[] OPEN  = {'(', '[', '{'};
    private final char[] CLOSE = {')', ']', '}'};
    private Stack<Character> STACK = new Stack<>();

    public Boolean run(String expression){
        if(expression == null) throw new IllegalArgumentException();

        for(char c : expression.toCharArray()){
            if(arrayContains(CLOSE, c)){
                if(STACK.isEmpty() || !bracketHasPair(c, STACK.pop())) return false;
            }

            if(arrayContains(OPEN, c)) {
                STACK.push(c);
            }
        }
        return true;
    }

    private Boolean arrayContains(char[] array, char c){
        for(char bracket : array){
            if(c == bracket) return true;
        }
        return false;
    }

    private Boolean bracketHasPair(char closed, char open){
        int index = 0;
        for(char bracket : OPEN){
            if(bracket == open) return CLOSE[index] == closed;
            index++;
        }
        return false;
    }
}
