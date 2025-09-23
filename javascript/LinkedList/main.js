import { LinkedList } from "./linkedList.js";

const myLinkedList = new LinkedList(1);
myLinkedList.appendLast(2);
myLinkedList.appendLast(3);
myLinkedList.appendLast(4);
myLinkedList.appendLast(5);
myLinkedList.reverseBetween(1, 3);

console.log(myLinkedList.getLinkedList());
