package stack;

//Queue Using Stacks: Dequeue ( ** Interview Question)
//Implement the Dequeue Method for a Queue using Two Stacks
//
//Description:
//In this assignment, you are tasked with implementing the dequeue method for a custom queue class called
//MyQueue using two stacks, stack1 and stack2.
//A queue is a data structure that follows the First-In-First-Out (FIFO) principle, meaning that the first element
//added to the queue will be the first one to be removed.
//Your implementation must maintain the FIFO order of elements in the queue using two stacks.
//Your task is to implement the following method:
//
//public Integer dequeue()
//This method should remove and return the front element of the queue. If the queue is empty, the method should return null.
//Note: You are not allowed to use any data structures other than the provided stacks (stack1 and stack2).
//
//Guidelines:
//Check if the queue is empty using the isEmpty() method.
//If the queue is empty, return null.
//Otherwise, remove and return the front element of the queue by popping the top element from stack1.
//
//Example:
//MyQueue q = new MyQueue();
//q.enqueue(1);
//q.enqueue(2);
//q.enqueue(3);
//Integer front = q.dequeue(); // front should be 1, and the queue now has elements 2 and 3

public class exerc_5 {

    public static void main(String[] args){
        Stack myStack = new Stack(0);
        myStack.pop();

        myStack.enqueue(1);
        myStack.enqueue(2);
        myStack.enqueue(3);

        myStack.dequeue();
        myStack.getStack();
    }
}
