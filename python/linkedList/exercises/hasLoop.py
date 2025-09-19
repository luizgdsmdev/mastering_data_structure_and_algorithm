#2° CHALLANGE
#You must find if in the given Linked list there is a loop between the existing nodes and return true
#(if there is a loop) or false (in case there's no loop).
#Ex: [1 -> 2 -> 3 -> 4 -> 5 -> null] = no loop -> return false.
#Ex: [1 -> 2 -> 3 -> 4 -> 5 -> 1] = loop -> return true.
#  Constraints:
#  You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
#  You can only traverse the linked list once.

import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from Linked_list import LinkedList

my_list = LinkedList(1);
my_list.appendLast(2);
my_list.appendLast(3);
my_list.appendLast(4);
my_list.appendLast(5);

print(my_list.hasLoop());


