//2° CHALLANGE
//You must find if in the given Linked list there is a loop between the existing nodes and return true
//(if there is a loop) or false (in case there's no loop).
//Ex: [1 -> 2 -> 3 -> 4 -> 5 -> null] = no loop -> return false.
//Ex: [1 -> 2 -> 3 -> 4 -> 5 -> 1] = loop -> return true.
//  Constraints:
//  You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
//  You can only traverse the linked list once.

import { LinkedList } from "../linkedList.js";

const myLinkedList = new LinkedList(1);
myLinkedList.appendLast(2);
myLinkedList.appendLast(3);
myLinkedList.appendLast(4);
myLinkedList.appendLast(5);
myLinkedList.appendLast(6);

console.log(myLinkedList.hasLoop());
