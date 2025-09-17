export class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

export class LinkedList {
  constructor(value) {
    const newNode = new Node(value);
    this.head = newNode;
    this.tail = newNode;
    this.length = 1;
  }

  //Append an new node to the end of the linked list, O(1);
  //return the Node VALUE when true or null when false
  appendLast(value) {
    if (!value) return null;
    const newNode = new Node(value);
    if (this.length == 0) {
      //Edge case for 0 node, set the head.next to right position
      this.tail = newNode;
      this.head = newNode;
      this.tail.next = null;
      this.length++;
      return this.tail.value;
    }
    this.tail.next = newNode;
    this.tail = newNode;
    this.length++;

    return newNode.value;
  }

  //Remove last node in the end of the linked list, O(n);
  //return the Node VALUE when true or null when false
  removeLast() {
    if (this.length == 0) return null;

    let temp = this.head;
    if (this.length == 1) {
      this.head = null;
      this.tail = null;
      this.length = 0;
      return temp.value;
    }

    while (temp.next != this.tail) {
      temp = temp.next;
    }
    this.tail = temp;
    temp = this.tail.next;
    this.tail.next = null;
    this.length--;

    return temp.value;
  }

  //Insert first node in the start position of the linked list, O(1);
  //return the Node VALUE when true or null when false
  appendFirst(value) {
    if (!value) return null;
    let newNode = new Node(value);
    if (this.length == 0) {
      this.head = newNode;
      this.tail = newNode;
    }

    if (this.length == 1) {
      newNode.next = this.head;
      this.head = newNode;
      this.head.next = this.tail;
    } else {
      newNode.next = this.head;
      this.head = newNode;
    }

    this.length++;
    return this.head.value;
  }

  //remove first node from linked list, O(1);
  //return the Node VALUE when true or null when false
  removFirst() {
    if (this.length == 0) return null;

    let temp = this.head;
    if (this.length == 1) {
      this.head = null;
      this.tail = null;
    } else {
      this.head = this.head.next;
    }

    this.length--;
    return temp.value;
  }

  //Insert a node in specific position of the linked list, O(n);
  //return the Node VALUE when true or null when false
  addNode(index, value) {
    if (!index || index <= 0 || index > this.length) return null;
    if (index == 1) return this.appendFirst(value);
    if (index == this.length) return this.appendLast(value);

    let newNode = new Node(value);
    let temp = this.head;
    let prev = null;

    for (let i = 1; i < index; i++) {
      prev = temp;
      temp = temp.next;
    }

    newNode.next = temp;
    prev.next = newNode;
    this.length++;
    return newNode.value;
  }

  //Remove a Node from a specific position of the linked list, O(n);
  //return the Node VALUE when true or null when false
  removeNode(index) {
    if (!index || index <= 0 || index > this.length) return null;
    if (index == 1) return this.removFirst();
    if (index == this.length) return this.removeLast();

    let temp = this.head;
    let prev = null;
    for (let i = 1; i < index; i++) {
      prev = temp;
      temp = temp.next;
    }

    prev.next = temp.next;
    this.length--;

    return temp.value;
  }

  //Return a Node from a specific position of the linked list, O(n);
  //return the Node VALUE when true or null when false
  getNode(index) {
    if (!index || index <= 0 || index > this.length) return null;
    if (index == 1) return this.head;
    if (index == this.length) return this.tail;

    let temp = this.head;

    for (let i = 1; i < index; i++) {
      temp = temp.next;
    }

    return temp;
  }

  //Reverse all node of the LinkedLists, O(n)
  //No return
  reverseLinkedList() {
    let temp = this.head;
    this.head = this.tail;
    this.tail = temp;
    let before = null;
    let after = null;

    for (let i = 0; i < this.length; i++) {
      after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
    }
    //         T              H
    // null <- 1 <- 2 <- 3  4 -> null
    //                   b  ta
  }

  //Get middle Node int the Linked list by looping on every node once, O(n)
  //Return the middle Node value.
  findMiddleNode() {
    if (this.length == 0) return null;
    if (this.length == 1) return this.head;
    let slow = this.head;
    let fast = this.head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow.value;
  }

  //Find if linked list has a loop and the first Node of the loop, o(n)
  //Return a object with true (or false) and the first node.
  hasLoop() {
    if (this.length <= 1) return { hasLoop: false };
    let nodeLoop = this.getNode(4);
    this.tail.next = nodeLoop; //Forcing loop
    let slow = this.head;
    let fast = this.head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        slow = this.head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return { hasLoop: true, firstNodeOnLoop: slow.value };
      }
    }
    return { hasLoop: false };
  }

  //Find a node in the linked list based on an input, counting from the end. O(n)
  //Return the node or null
  findKthFromEnd(k) {
    let fast = this.head;
    let slow = this.head;

    for (let i = 0; i < k; i++) {
      if (fast === null) {
        return null;
      } else {
        fast = fast.next;
      }
    }
    while (fast !== null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }

  getHead() {
    if (this.length == 0) return null;
    return this.head.value;
  }

  getTail() {
    if (this.length == 0) return null;
    return this.tail.value;
  }

  getlength() {
    if (this.length == 0) return null;
    return this.length;
  }

  getLinkedList() {
    if (this.length == 0) return null;

    let temp = this.head;
    const myArray = new Array();
    for (let i = 0; i < this.length; i++) {
      myArray.push(temp.value);
      temp = temp.next;
    }
    return myArray;
  }
}
