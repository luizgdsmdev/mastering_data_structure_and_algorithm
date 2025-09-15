//1° CHALLANGE
//Given an LinkedList (ex: [1 -> 2 -> 3 -> 4 -> 5 -> null]), you must find the
//middle node of the list.
//You **don't have the length** attribute of the linked list.
//Rules:
//  - You can **only loop once** through the linked list;
//  - You **cannot count** how many nodes exist in the linked list.

import { LinkedList } from "../linkedList.js";

const myLinkedList = new LinkedList(1);
myLinkedList.appendLast(2);
myLinkedList.appendLast(3);
myLinkedList.appendLast(4);
myLinkedList.appendLast(5);
myLinkedList.appendLast(6);
myLinkedList.appendLast(7);
myLinkedList.appendLast(8);

console.log(myLinkedList.findMiddleNode());
