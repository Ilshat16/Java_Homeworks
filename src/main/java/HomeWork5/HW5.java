package HomeWork5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class HW5 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        Map<Character, Character> brakets = new HashMap<>();
        brakets.put(')', '(');
        brakets.put('}', '{');
        brakets.put(']', '[');
        brakets.put('>', '<');
        Deque <Character> result = new LinkedList<>();
        for (char ch: parentheses.toCharArray()) {
            if (brakets.containsValue(ch)) {
                result.addFirst(ch);
            }
            if (brakets.containsKey(ch)) {
                try {
                    if(result.getFirst().equals(brakets.get(ch))) {
                        result.pollFirst();
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        if (result.size() == 0) {
            return true;
        }
        return false;
    }
}
