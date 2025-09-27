package stack;

//Queue Using Stacks: Enqueue ( ** Interview Question)
//Implement the Enqueue Method for a Queue using Two Stacks
//
//Description:
//In this assignment, you are tasked with implementing the enqueue method for a custom queue class called MyQueue using two stacks,
//stack1 and stack2.
//A queue is a data structure that follows the First-In-First-Out (FIFO) principle, meaning that the first element added to the queue
//will be the first one to be removed. Your implementation must maintain the FIFO order of elements in the queue using two stacks.
//Your task is to implement the following method:
//
//public void enqueue(int value)
//This method takes an integer value as input and adds it to the queue.
//Note: You are not allowed to use any data structures other than the provided stacks (stack1 and stack2).
//
//Example:
//MyQueue q = new MyQueue();
//q.enqueue(1);
//q.enqueue(2);
//q.enqueue(3);
//
//After these operations, the queue should have the following elements in order: 1, 2, 3.

public class exerc_4 {

    public static void main(String[] args){
        Stack myStack = new Stack(0);
        myStack.pop();

        myStack.enqueue(1);
        myStack.enqueue(2);
        myStack.enqueue(3);
        myStack.getStack();
    }

}
