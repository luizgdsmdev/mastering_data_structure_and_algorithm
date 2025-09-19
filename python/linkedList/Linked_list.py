

from sqlalchemy import null


class Node:
    def __init__(self, value):
        self.value = value;
        self.next = None;

class LinkedList:
    def __init__(self, value):
        newNode = Node(value);
        self.head = newNode;
        self.tail = newNode;
        self.length = 1;
    
    #Append an new node to the end of the linked list, O(1);
    #return the Node VALUE when true or None when false
    def appendLast(self, value):
        newNode = Node(value);
        if(self.length == 0):
            self.head = newNode;
            self.tail = newNode;
            self.tail.next = None;
        else:
            self.tail.next = newNode;
            self.tail = newNode;
            self.tail.next = None;
        self.length += 1
        return newNode.value;
    
    #Insert first node in the start position of the linked list, O(1);
    #return the Node VALUE when true or None when false
    def appendFirst(self, value):
        newNode = Node(value);
        if self.length == 0:
            self.head = newNode;
            self.tail = newNode;
            self.tail.next = None;
        else:
            newNode.next = self.head;
            self.head = newNode;
        
        self.length += 1;
        return newNode.value;
    
    #Remove last node in the end of the linked list, O(n);
    #return the Node VALUE when true or None when false
    def removeLast(self):
        if (self.length <= 0): return False;
        if self.length == 1:
            self.head = None;
            self.tail = None;
        else:
            temp = self.head;
            prev = null;
            while(temp.next != None):
                prev = temp;
                temp = temp.next;
            self.tail = prev;
            self.tail.next = None;
            
        self.length -= 1;
        return True;
    
    #Remove first node from linked list, O(1);
    #return the Node VALUE when true or None when false
    def removeFirst(self):   
        if self.length == 0: return False;
        if self.length == 1:
            self.head = None;
            self.tail = None;
        else:
            self.head = self.head.next;
        
        self.length -= 1;
        return True;
    
    #Insert a node in specific position of the linked list, O(n);
    #return the Node VALUE when true or false when false
    def addNode(self, index, value):
        if index <= 0 or index > self.length: return False;
        if index == 1: return self.appendFirst(value);
        
        newNode = Node(value);
        temp = self.head;
        prev = None;
        for i in range(index - 1):
            prev = temp;
            temp = temp.next;
        newNode.next = temp;
        prev.next = newNode;
        
        self.length += 1;
        return newNode.value;
    
    #Remove a Node from a specific position of the linked list, O(n);
    #return the Node VALUE when true or false when false
    def removeNode(self, index):
        if index <= 0 or index > self.length: return False;
        if index == 1: return self.removeFirst();
        if index == self.length: return self.removeLast();
        
        temp = self.head;
        prev = None;
        for i in range(index - 1):
            prev = temp;
            temp = temp.next;
        prev.next = temp.next;
        
        self.length -= 1;
        return temp.value;
    
    #Return a Node from a specific position of the linked list, O(n);
    #return the Node when true or false when false
    def getNode(self, index):
        if index <= 0 or index > self.length: return False;
        if index == 1: return self.head;
        if index == self.length: return self.tail;
        
        temp = self.head;
        for i in range(index - 1):
            temp = temp.next;
        return temp;
    
    
    
    def getHead(self):
        if self.length == 0: print("Head: None")
        else:
            print("Head: " + str(self.head.value));
    
    def getTail(self):
        if self.length == 0: print("Head: None")
        else:
            print("tail: " + str(self.tail.value));
    
    def getLength(self):
        if self.length == 0: print("length: None");
        else:
            print("length: " + str(self.length));
    
    def getlinkedList(self):
        if self.length == 0: print("Empty Linked List");
        else:
            temp = self.head;
            while temp != None:
                print(temp.value);
                temp = temp.next;
            


