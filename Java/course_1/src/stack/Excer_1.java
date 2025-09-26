package stack;

//Reverse String ( ** Interview Question)
//The reverseString method takes a single parameter String, which is the string you want to reverse.
//Return a new String with the letters in reverse order.
//This method will be written in the same class as the main method so it will be static.
//For more information on static methods click on "Hints."


public class Excer_1 {
    public static String reverseString(String word){
        if(word.length() <= 1) return word;
        StringBuilder myString = new StringBuilder();

        int pointer = word.length() - 1;

        while(pointer >= 0){
            myString.append(word.charAt(pointer));
            pointer--;
        }

        return myString.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseString("asdajshdj"));
        // Explain purpose
        System.out.println("These tests confirm reverseString works");
        System.out.println("for normal words, empty strings,");
        System.out.println("single characters, palindromes, and");
        System.out.println("strings with spaces and symbols.");
        System.out.println();

        // Test 1: Normal word
        System.out.println("Test 1: Normal Word");
        System.out.println("Input: 'hello'");
        System.out.println("Expected: 'olleh'");
        System.out.println("Actual: '" + reverseString("hello") + "'");
        System.out.println();

        // Test 2: Empty string
        System.out.println("Test 2: Empty String");
        System.out.println("Input: ''");
        System.out.println("Expected: ''");
        System.out.println("Actual: '" + reverseString("") + "'");
        System.out.println();

        // Test 3: Single character
        System.out.println("Test 3: Single Character");
        System.out.println("Input: 'A'");
        System.out.println("Expected: 'A'");
        System.out.println("Actual: '" + reverseString("A") + "'");
        System.out.println();

        // Test 4: Palindrome
        System.out.println("Test 4: Palindrome");
        System.out.println("Input: 'madam'");
        System.out.println("Expected: 'madam'");
        System.out.println("Actual: '" + reverseString("madam") + "'");
        System.out.println();

        // Test 5: Spaces and symbols
        System.out.println("Test 5: Spaces and Symbols");
        System.out.println("Input: 'abc !'");
        System.out.println("Expected: '! cba'");
        System.out.println("Actual: '" + reverseString("abc !") + "'");
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm reverseString works
            for normal words, empty strings,
            single characters, palindromes, and
            strings with spaces and symbols.

            Test 1: Normal Word
            Input: 'hello'
            Expected: 'olleh'
            Actual: 'olleh'

            Test 2: Empty String
            Input: ''
            Expected: ''
            Actual: ''

            Test 3: Single Character
            Input: 'A'
            Expected: 'A'
            Actual: 'A'

            Test 4: Palindrome
            Input: 'madam'
            Expected: 'madam'
            Actual: 'madam'

            Test 5: Spaces and Symbols
            Input: 'abc !'
            Expected: '! cba'
            Actual: '! cba'
        */
    }
}
