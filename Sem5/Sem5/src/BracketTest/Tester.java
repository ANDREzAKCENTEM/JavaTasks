package BracketTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class Tester {
    public static boolean isCorrectBraces(String s, Map<Character, Character> bracers){
        Deque<Character> stack = new ArrayDeque<>();
        for(char symbol : s.toCharArray()){
            if(bracers.containsKey(symbol)){
                stack.push(symbol);
            }
            else if(bracers.containsValue(symbol)){
                if(!stack.pop().equals(symbol))return false;
            }
        }
        return true;
    }
}
