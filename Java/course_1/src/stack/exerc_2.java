package stack;

//Stack: Parentheses Balanced ( ** Interview Question)
//Check to see if a string of parentheses is balanced or not.
//By "balanced," we mean that for every open parenthesis, there is a matching closing parenthesis in the correct order.
//        For example, the string "((()))" has three pairs of balanced parentheses, so it is a balanced string.
//On the other hand, the string "(()))" has an imbalance, as the last two parentheses do not match, so it is not balanced.
//Also, the string ")(" is not balanced because the close parenthesis needs to follow the open parenthesis.
//
//Your program should take a string of parentheses as input and return true if it is balanced, or false if it is not.
//In order to solve this problem, use a Stack data structure.
//Method name: isBalancedParentheses
//Return type: boolean
//This method will be written in the same class as the main method so it will be static.

public class exerc_2 {
    public static boolean isBalancedParentheses(String input){
        if(input.isEmpty()) return true;
        if(input.length() == 1) return false;

        int pointer = 0;
        int count = 0;

        while (pointer < input.length()) {
            if (input.charAt(pointer) == '(') {
                count++;
            } else {
                if (count <= 0) return false;
                else count--;
            }
            pointer++;
        }

        if(count > 0) return false;
        else return true;
    }




    public static void main(String[] args) {
        System.out.println("These tests confirm isBalancedParentheses");
        System.out.println("works for empty strings, simple pairs,");
        System.out.println("nested parentheses, and unbalanced cases.");
        System.out.println();

        // Test 1
        System.out.println("Test 1: Empty String");
        System.out.println("Input: ''");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses(""));
        System.out.println();

        // Test 2
        System.out.println("Test 2: Single Pair");
        System.out.println("Input: '()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()"));
        System.out.println();

        // Test 3
        System.out.println("Test 3: Missing Open");
        System.out.println("Input: ')'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses(")"));
        System.out.println();

        // Test 4
        System.out.println("Test 4: Missing Close");
        System.out.println("Input: '('");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("("));
        System.out.println();

        // Test 5
        System.out.println("Test 5: Multiple Pairs");
        System.out.println("Input: '()()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("()()"));
        System.out.println();

        // Test 6
        System.out.println("Test 6: Nested Balanced");
        System.out.println("Input: '(())'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("(())"));
        System.out.println();

        // Test 7
        System.out.println("Test 7: Nested Unbalanced");
        System.out.println("Input: '(()'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("(()"));
        System.out.println();

        // Test 8
        System.out.println("Test 8: Complex Balanced");
        System.out.println("Input: '(()())()'");
        System.out.println("Expected: true");
        System.out.println("Actual: " + isBalancedParentheses("(()())()"));
        System.out.println();

        // Test 9
        System.out.println("Test 9: Complex Unbalanced");
        System.out.println("Input: '())(()'");
        System.out.println("Expected: false");
        System.out.println("Actual: " + isBalancedParentheses("())(()"));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm isBalancedParentheses
            works for empty strings, simple pairs,
            nested parentheses, and unbalanced cases.

            Test 1: Empty String
            Input: ''
            Expected: true
            Actual: true

            Test 2: Single Pair
            Input: '()'
            Expected: true
            Actual: true

            Test 3: Missing Open
            Input: ')'
            Expected: false
            Actual: false

            Test 4: Missing Close
            Input: '('
            Expected: false
            Actual: false

            Test 5: Multiple Pairs
            Input: '()()'
            Expected: true
            Actual: true

            Test 6: Nested Balanced
            Input: '(())'
            Expected: true
            Actual: true

            Test 7: Nested Unbalanced
            Input: '(()'
            Expected: false
            Actual: false

            Test 8: Complex Balanced
            Input: '(()())()'
            Expected: true
            Actual: true

            Test 9: Complex Unbalanced
            Input: '())(()'
            Expected: false
            Actual: false
        */

    }

}
