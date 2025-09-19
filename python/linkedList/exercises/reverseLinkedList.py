import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..')))
from Linked_list import LinkedList

my_list = LinkedList(1);
my_list.appendLast(2);
my_list.appendLast(3);
my_list.appendLast(4);

my_list.reverseLinkedList();

my_list.getHead();
my_list.getTail();
my_list.getLength();
my_list.getlinkedList();