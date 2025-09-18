//6° CHALLANGE
//  Partition List ( ** Interview Question)
// ⚠️ CAUTION: Advanced Challenge Ahead!

// This Linked List problem is significantly more challenging than the ones we've tackled so far. It's common for students at this stage to find this exercise demanding, so don't worry if you're not ready to tackle it yet. It's perfectly okay to set it aside and revisit it later when you feel more confident.
// If you decide to take on this challenge, I strongly advise using a hands-on approach: grab a piece of paper and visually map out each step.
// This problem requires a clear understanding of how elements in a Linked List interact and move. By now, you've observed numerous Linked List animations in the course, which have prepared you for this moment.
// This exercise will be a true test of your ability to apply those concepts practically. Remember, patience and persistence are key here!
// Now, here is the exercise:

// Implement a member function called partitionList(x) that partitions the linked list such that all nodes with values less than x come before nodes with values greater than or equal to x.
// Note: this linked list class does not have a tail which will make this method easier to implement.
// The original relative order of the nodes should be preserved.

// Input:
// An integer x, the partition value.

// Output:
// The function should modify the linked list in-place, such that all nodes with values less than x come before nodes with values greater than or equal to x.

// Constraints:
// You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
// You can only traverse the linked list once.
// You can create temporary nodes to make the implementation simpler.

// Example 1:
// Input: Linked List: 3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5

// Process:
// Values less than 5: 3, 2, 1
// Values greater than or equal to 5: 8, 5, 10
// Output: Linked List: 3 -> 2 -> 1 -> 8 -> 5 -> 10

// Example 2:
// Input: Linked List: 1 -> 4 -> 3 -> 2 -> 5 -> 2 x: 3
// Process:
// Values less than 3: 1, 2, 2
// Values greater than or equal to 3: 4, 3, 5
// Output: Linked List: 1 -> 2 -> 2 -> 4 -> 3 -> 5

// Tips:
// While traversing the linked list, maintain two separate chains: one for values less than x and one for values greater than or equal to x.
// Use dummy nodes to simplify the handling of the heads of these chains.
// After processing the entire list, connect the two chains to get the desired arrangement.

// Note:
// The solution must maintain the relative order of nodes. For instance, in the first example, even though 8 appears before 5 in the original list, the partitioned list must still have 8 before 5 as their relative order remains unchanged.

// Note:
// You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the nodes' next pointers may be changed.)

//3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5
import { LinkedList } from "../linkedList.js";

const myLinkedList = new LinkedList(3);
myLinkedList.appendLast(8);
myLinkedList.appendLast(5);
myLinkedList.appendLast(10);
myLinkedList.appendLast(2);
myLinkedList.appendLast(1);

// Input: Linked List: 3 -> 8 -> 5 -> 10 -> 2 -> 1 x: 5
// Output: Linked List: 3 -> 2 -> 1 -> 8 -> 5 -> 10
console.log(myLinkedList.partitionList(5));
console.log(myLinkedList.getLinkedList());

// const myLinkedList = new LinkedList(1);
// myLinkedList.appendLast(4);
// myLinkedList.appendLast(3);
// myLinkedList.appendLast(2);
// myLinkedList.appendLast(5);
// myLinkedList.appendLast(2);

// // Input: Linked List: 1 -> 4 -> 3 -> 2 -> 5 -> 2 x: 3
// // Output: Linked List: 1 -> 2 -> 2 -> 4 -> 3 -> 5
// console.log(myLinkedList.partitionList(3));
// console.log(myLinkedList.getLinkedList());
