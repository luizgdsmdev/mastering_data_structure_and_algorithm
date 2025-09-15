import { LinkedList } from "./linkedList.js";

const myLinkedList = new LinkedList(1);
myLinkedList.appendLast(2);
myLinkedList.appendLast(3);
myLinkedList.appendLast(7);
myLinkedList.reverseLinkedList();

console.log("Head: " + myLinkedList.getHead());
console.log("tail: " + myLinkedList.getTail());
console.log("length: " + myLinkedList.getlength());
console.log(myLinkedList.getLinkedList());
