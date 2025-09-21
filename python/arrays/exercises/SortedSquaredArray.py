# Coding Exercise: Sorted Squared Array
# Question: You are given an array of Integers in which each subsequent value is not less than the previous value. 
# Write a function that takes this array as an input and returns a new array with the squares of each number sorted 
# in ascending order.

import array
from unittest import result

from sqlalchemy import null


case1 = [1,3,5]; #[1,9,25]
case2 = [0,5,6]; #[0,25,36]
case3 = [-4,-2,0,1,3]; #[0,1,4,9,16]
case4 = [5, -1, 2, -10]; #[1, 4, 25, 100]
case5 = [1, 2, 3, 4, 5]; #[1, 4, 9, 16, 25]
case6 = [-3, -1, 0, 8]; #[0, 1, 9, 64]

#Using the sorted() method
def sorted_squared(input):
    if len(input) == 0: return null;
    if len(input) == 1: return input;
    return sorted([i * i for i in input]);
#print(sorted_squared(case3));

#Sorting mannualy, using two pointers approach
def sorted_squared_M(input):
    if len(input) == 0: return null;
    if len(input) == 1: return input;
    
    n = len(input);
    newArray = [0] * n;
    left, right = 0, n - 1;
    write_pointer = n - 1;
    
    while left <= right:
        left_val = input[left]; 
        right_val = input[right];
        
        if abs(left_val) > abs(right_val):
            newArray[write_pointer] = left_val * left_val;
            left += 1;
        else:
            newArray[write_pointer] = right_val * right_val;
            right -= 1;
        write_pointer -= 1;
    return newArray;
    
    
                

print(sorted_squared_M(case3));