

from sqlalchemy import null, true


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
    
    #Reverse all node of the LinkedLists, O(n)
    #No return
    def reverseLinkedList(self):
        temp = self.head;
        self.head = self.tail;
        self.tail = temp;
        
        before = None;
        after = temp;
        
        for i in range(self.length):
            after = after.next;
            temp.next = before;
            before = temp;
            temp = after; 
    
    #Get middle Node int the Linked list by looping on every node once, O(n)
    #Return the middle Node value.
    def findMiddleNode(self):
        if self.length <= 0: return None;
        if self.length == 1: return self.head;
        
        slow = self.head;
        fast = self.head;
        while(fast != None and fast.next != None):
            slow = slow.next;
            fast = fast.next.next;
        return slow.value;
    
    #Find if linked list has a loop and the first Node of the loop, o(n)
    #Return a object with true (or false) and the first node from the loop.
    def hasLoop(self):
        self.getNode(5).next = self.getNode(2); #Forcing a loop
        slow = self.head;
        fast = self.head;
        
        while(fast != None and fast.next != None):
            slow = slow.next;
            fast = fast.next.next;
            
            if slow == fast:
                slow = self.head;
                while(slow != fast):
                    slow = slow.next;
                    fast = fast.next;
                return {"hasLoop": True, "NodeForLoop": slow.value};    
        return False;
    
    #Find a node in the linked list based on an input, counting from the end. O(n)
    #Return the node or null
    def findKthFromEnd(self, k):
        slow = self.head;
        fast = self.head;
        
        for i in range(k):
            if fast == None:
                return False;
            else:
                fast = fast.next;
        
        while(fast != None):
            fast = fast.next;
            slow = slow.next;
        return slow.value;
    
    def getHead(self):
        if self.length == 0: print("Head: None")
        else:
            print("Head: " + str(self.head.value));
    
    #Removes duplicated Nodes in a Linked list using a hashSet as auxiliar, O(n)
    #Return null if has no duplicates, if has will remove and alter the original linked list
    def removeDuplicates(self):
        hash_Set = set();
        temp = self.head;

        while(temp.next != None):
            hash_Set.add(temp.value);
            if(temp.next.value in hash_Set):
                temp.next = temp.next.next;
                self.length -= 1;
            else:
                temp = temp.next;
    
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
            


