#1° CHALLANGE
#Given an LinkedList (ex: [1 -> 2 -> 3 -> 4 -> 5 -> null]), you must find the
#middle node of the list.
#You **don't have the length** attribute of the linked list.
#Rules:
#  - You can **only loop once** through the linked list;
#  - You **cannot count** how many nodes exist in the linked list.

# Example 1:
# Suppose you have a LinkedList object, list, with the following values: 1 -> 2 -> 3 -> 4 -> 5
# After calling the findMiddleNode() the middle node should have the value 3.

# Example 2:
# Now suppose you have a LinkedList object, list, with the following values: 1 -> 2 -> 3 -> 4 -> 5 -> 6
# After calling the findMiddleNode() the middle node should have the value 4.


import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from Linked_list import LinkedList

my_list = LinkedList(1);
my_list.appendLast(2);
my_list.appendLast(3);
my_list.appendLast(4);
my_list.appendLast(5);
my_list.appendLast(6);

print(my_list.findMiddleNode());


