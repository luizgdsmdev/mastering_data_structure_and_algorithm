package linkedList.creating;


import java.util.HashSet;
import java.util.Set;

//Basic structure for a linked list
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //1° CHALLANGE
    //Given an LinkedList (ex: [1 -> 2 -> 3 -> 4 -> 5 -> null]), you must find the
    //middle node of the list.
    //You **don't have the length** attribute of the linked list.
    //Rules:
    //  - You can **only loop once** through the linked list;
    //  - You **cannot count** how many nodes exist in the linked list.
    public Node findMiddleNode(){
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            fast = fast.next;
        }
        System.out.println(slow.value);
        return slow;
    }

    //2° CHALLANGE
    //You must find if in the given Linked list there is a loop between the existing nodes and return true
    //(if there is a loop) or false (in case there's no loop).
    //Ex: [1 -> 2 -> 3 -> 4 -> 5 -> null] = no loop -> return false.
    //Ex: [1 -> 2 -> 3 -> 4 -> 5 -> 1] = loop -> return true.
    //  Constraints:
    //  You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
    //  You can only traverse the linked list once.

    public boolean hasLoop(){
        Node slow = head;
        Node fast = head;
        Node forceloop = getNode(4);
        forceloop.next = getNode(2);

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast  = fast.next.next;

            if(slow == fast){
                slow = head;

                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                System.out.println(slow.value);

                return true;
            }
        }
        return false;
    }

    //3° CHALLANGE
    // Find Kth Node From End ( ** Interview Question)
    // Implement a member function called findKthFromEnd(k) that finds and returns the kth node from the end of the linked list.

    // Note: this LinkedList implementation does not have a length member variable.

    // Output:
    // Return the kth node from the end of the linked list.
    // If the value of k is greater than or equal to the number of nodes in the list, return null.

    // Constraints:
    // You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
    // You can only traverse the linked list once.

    // Example 1:
    // Suppose you have a LinkedList object, list, with the following values: 1 -> 2 -> 3 -> 4 -> 5
    // After calling the findKthFromEnd(2) function:
    // let kthNode = list.findKthFromEnd(2);
    // The kthNode should have the value 4.

    // Example 2:
    // Now suppose you have a LinkedList object, list, with the following values: 1 -> 2 -> 3 -> 4 -> 5 -> 6
    // After calling the findKthFromEnd(4) function:
    // let kthNode = list.findKthFromEnd(4);
    // The kthNode should have the value 3.
    //Find a node in the linked list based on an input, counting from the end. O(n)
    //Return the node or null
    public Node findKthFromEnd(int k){
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; i++){
            if(fast == null){
                return null;
            }
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }

    //4° CHALLANGE
    //    Remove Duplicates ( ** Interview Question)
    //    You are given a singly linked list that contains integer values, where some of these values may be duplicated.
    //
    //    Note: this linked list class does NOT have a tail which will make this method easier to implement.
    //
    //    Your task is to implement a method called removeDuplicates() within the LinkedList class that removes all duplicate values from the list.
    //    Your method should not create a new list, but rather modify the existing list in-place, preserving the relative order of the nodes.
    //    You can implement the removeDuplicates() method in two different ways:
    //
    //    Using a Set (HashSet) - This approach will have a time complexity of O(n), where n is the number of nodes in the linked list. You are allowed to use the provided Set data structure in your implementation.
    //    Without using a Set - This approach will have a time complexity of O(n^2), where n is the number of nodes in the linked list. You are not allowed to use any additional data structures for this implementation.
    //
    //    Example:
    //    Input:
    //    LinkedList: 1 -> 2 -> 3 -> 1 -> 4 -> 2 -> 5
    //    Output:
    //    LinkedList: 1 -> 2 -> 3 -> 4 -> 5
    public void removeDuplicates(){
        Set<Integer> listNodes = new HashSet<Integer>();
        Node temp = head;

        while(temp != null && temp.next != null){
            listNodes.add(temp.value);
            if(listNodes.contains(temp.next.value)){
                temp.next = temp.next.next;
                length--;
            }else{
                temp = temp.next;
            }
        }
    }

    //5° CHALLANGE
    // You have a linked list where each node represents a binary digit (0 or 1). The goal of the binaryToDecimal function is to convert this binary number, represented by the linked list, into its decimal equivalent.

    // How Binary to Decimal Conversion Works:
    // In binary-to-decimal conversion, each position of a binary number corresponds to a specific power of 2, starting from the rightmost digit.
    // The rightmost digit is multiplied by 2^0 (which equals 1).
    // The next digit to the left is multiplied by 2^1 (which equals 2).
    // The digit after that is multiplied by 2^2 (which equals 4). ... and so on.
    // To find the decimal representation:
    // Multiply each binary digit by its corresponding power of 2 value.
    // Sum up all these products.

    // Example Execution with Binary 101:
    // Start with num = 0.
    // Process 1 (from the head of the linked list): num = 0 * 2 + 1 = 1
    // Process 0: num = 1 * 2 + 0 = 2
    // Process 1: num = 2 * 2 + 1 = 5
    // Return num, which is 5.

    // Steps Involved in the Function:
    // A variable num is initialized to 0, which will store our computed decimal number.
    // Starting from the head of the linked list (the leftmost binary digit), iterate through each node until the end.
    // For every node, double the current value of num (this is analogous to shifting in binary representation). Then, add the binary digit of the current node.
    // Move to the next node and repeat until you've visited all nodes.
    // Return the value in num, which now represents the decimal value of the binary number in the linked list.
    public int binaryToDecimal(){
        int sum = 0;
        Node temp = head;
        while(temp != null){
            sum = sum * 2 + temp.value;
            temp = temp.next;
        }

        return sum;
    }

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
    public void partitionList(int x){
        Node lesserH = new Node(0);
        Node greaterH = new Node(0);
        Node lesserT = lesserH;
        Node greaterT = greaterH;
        Node temp = head;

        while(temp != null){
            if(temp.value < x){
                lesserT.next = temp;
                lesserT = temp;
            }else{
                greaterT.next = temp;
                greaterT = temp;
            }
            temp = temp.next;
        }

        greaterT.next = null;
        lesserT.next = greaterH.next;
        head = lesserH.next;
    }




    //Appending value to the end of the LinkedList, O(1)
    public boolean appendLast(int value){
        Node newNode = new Node(value);
        if(length == 0){
            tail = newNode;
            head = newNode;
            length++;
            return true;
        }
        if(length == 1){
            head.next = newNode;
            tail = newNode;
            length++;
            return true;
        }

        tail.next = newNode;
        tail = newNode;

        length++;
        return true;
    }

    //Removing element from the end of the LinkedList O(n)
    public boolean removelast(){
        if(length == 0) return false;
        if(length == 1){
            head = null;
            tail = null;
            length--;
            return true;
        }

        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;

        length--;
        return true;
    }

    //Adding element to the beginning of the LinkedList, O(1)
    public boolean appendFirst(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            length++;
            return true;
        }

        newNode.next = head;
        head = newNode;

        length++;
        return true;
    }

    //Removing from the beginning of the LinkedList, O(1)
    public boolean removFirst(){
        if(length == 0) return false;
        if(length == 1){
            head = null;
            tail = null;
            length--;
            return true;
        }

        head = head.next;
        length--;
        return true;
    }

    //Adding a node into a specific position in the LinkedList sequence (by index), O(n)
    public boolean addNode(int index, int value){
        if(index <= 0 || index > length) return false;
        if(index == 1){
            appendFirst(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = head;
        if(index == length){
            while (temp.next != tail){
                temp = temp.next;
            }
            newNode.next = tail;
            temp.next = newNode;
            length++;
            return true;
        }

        for(int i = 1; i < (index - 1); i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    //Removing a specific element from the LinkedList sequence (by index), O(n)
    public boolean removeNode(int index){
        if(index <= 0 || index > length) return false;
        if(index == 1){
            removFirst();
            return true;
        }
        if(index == length){
            removelast();
            return true;
        }

        Node temp = head;
        Node prev = null;
        for(int i = 1; i < index; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp = null;

        length--;
        return true;
    }

    //Return the specific Node value (by index), O(n)
    public Node getNode(int index){
        if(index <= 0 || index > length) return null;
        if(index == 1) return head;
        if(index == length) return tail;

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    //Reverse all node of the LinkedLists, O(n)
    public void reverseLinkedList(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void getHead(){
        if(length == 0){
            System.out.println("Empty LinkedList");
        }else{
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail(){
        if(length == 0){
            System.out.println("Empty LinkedList");
        }else{
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getlength(){
        if(length == 0){
            System.out.println("Empty LinkedList.");
        }else{
            System.out.println("length: " + length);
        }
    }

    public void getlinkedList(){
        if(length == 0) System.out.println("Empty LinkedList.");
        Node temp = head;

        for (int i = 0; i < length; i++){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
