package stack;

//Stack: Sort Stack ( ** Interview Question)
//The sortStack method takes a single argument, a Stack object.
//The method should sort the elements in the stack in ascending order (the lowest value will be at the top of the stack)
//using only one additional stack.
//
//This will use the Stack class we created in these coding exercises:

//Once all the elements have been sorted, you should copy the sorted elements from the sorted stack to the original stack in the correct order.
//Overall, the function should have a time complexity of O(n^2), where n is the number of elements in the original stack, due to the
//nested loops used to compare the elements.  However, the function should only use one additional stack, which could be useful
//in situations where memory is limited.

/*
EXPECTED OUTPUT:
----------------
These tests confirm sortStack sorts
the stack so the TOP is the LOWEST value.

Test 1: Empty Stack
Expected (top to bottom): empty

Test 2: Single Element
Expected (top to bottom): 5
5

Test 3: Unsorted Stack
Expected (top to bottom): 1, 2, 3, 4
1
2
3
4

Test 4: Already Sorted Stack
Expected (top to bottom): 1, 2, 3, 4
1
2
3
4

Test 5: Reverse Sorted Stack
Expected (top to bottom): 1, 2, 3, 4
1
2
3
4

Test 6: With Duplicates
Expected (top to bottom): 1, 1, 2, 3, 3
1
1
2
3
3

Test 7: With Negatives
Expected (top to bottom): -5, -1, 2, 3
-5
-1
2
3
*/

public class exerc_3 {

public static void main(String[] args){
    // Test 1: Empty stack
//    Stack stack = new Stack(3);
//    stack.pop();
//    System.out.println("Test 1: Empty Stack");
//    stack.sortStack(stack);
//    System.out.println("Expected (top to bottom): empty");
//    System.out.println("Result below: ");
//    stack.getStack();
//    System.out.println();

//    // Test 2: Single element
//    System.out.println("Test 2: Single Element");
//    Stack stack = new Stack(5);
//    stack.sortStack(stack);
//    System.out.println("Expected (top to bottom): 5");
//    System.out.println("Result below: ");
//    stack.getStack();
//    System.out.println();


//    // Test 3: Unsorted stack
//    System.out.println("Test 3: Unsorted Stack");
//    Stack stack = new Stack(3);
//    stack.push(1);
//    stack.push(4);
//    stack.push(2);
//    stack.sortStack(stack);
//    System.out.println("Expected (top to bottom): 1, 2, 3, 4");
//    System.out.println("Result below: ");
//    stack.getStack();
//    System.out.println();

//    // Test 4: Already sorted
//    System.out.println("Test 4: Already Sorted Stack");
//    Stack stack = new Stack(4);
//    stack.push(3);
//    stack.push(2);
//    stack.push(1);
//    stack.sortStack(stack);
//    System.out.println("Expected (top to bottom): 1, 2, 3, 4");
//    System.out.println("Result below: ");
//    stack.getStack();
//    System.out.println();

//    // Test 5: Reverse sorted
//    System.out.println("Test 5: Reverse Sorted Stack");
//    Stack stack = new Stack(1);
//    stack.push(2);
//    stack.push(3);
//    stack.push(4);
//    stack.sortStack(stack);
//    System.out.println("Expected (top to bottom): 1, 2, 3, 4");
//    System.out.println("Result below: ");
//    stack.getStack();
//    System.out.println();

//    // Test 6: With duplicates
//    System.out.println("Test 6: With Duplicates");
//    Stack stack = new Stack(3);
//    stack.push(1);
//    stack.push(3);
//    stack.push(2);
//    stack.push(1);
//    stack.sortStack(stack);
//    System.out.println("Expected (top to bottom): 1, 1, 2, 3, 3");
//    System.out.println("Result below: ");
//    stack.getStack();
//    System.out.println();

    // Test 7: With negatives
    System.out.println("Test 7: With Negatives");
    Stack stack = new Stack(-1);
    stack.push(3);
    stack.push(-5);
    stack.push(2);
    stack.sortStack(stack);
    System.out.println("Expected (top to bottom): -5, -1, 2, 3");
    System.out.println("Result below: ");
    stack.getStack();
    System.out.println();

    }

}
