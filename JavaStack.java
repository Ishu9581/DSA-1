// Question 8: Java Stack

// Skill Mapping: Basic

// Description: Solve the HackerRank Problem given as a link below -

// https://www.hackerrank.com/challenges/java-stack/problem

package assessment;

import java.util.*;

class JavaStack {
    private static boolean isOpen(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

  
    private static boolean isClose(char ch) {
        return ch == ')' || ch == '}' || ch == ']';
    }

    
    private static boolean isPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

  
    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isOpen(ch)) {
                stack.push(ch);
            } else if (isClose(ch)) {
                if (stack.isEmpty() || !isPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            boolean isBalanced = isBalanced(input);
            System.out.println(isBalanced);
        }

        sc.close();
    }
}
