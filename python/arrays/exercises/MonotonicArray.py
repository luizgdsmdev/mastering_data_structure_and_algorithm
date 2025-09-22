# Coding Exercise: Monotonic Array
# Question: An array is monotonic if it is either monotone increasing or monotone decreasing. 
# An array is monotone increasing if all its elements from left to right are non-decreasing. 
# An array is monotone decreasing if all  its elements from left to right are non-increasing. 
# Given an integer array return true if the given array is monotonic, or false otherwise.

# Test Case 1: Monotone Increasing ArrayInput: [1, 2, 2, 3]
# Expected Output: true
# Explanation: The array is monotone increasing, as the elements are non-decreasing (1 ≤ 2 ≤ 2 ≤ 3).

# Test Case 2: Monotone Decreasing ArrayInput: [6, 5, 4, 4]
# Expected Output: true
# Explanation: The array is monotone decreasing, as the elements are non-increasing (6 ≥ 5 ≥ 4 ≥ 4).

# Test Case 3: Non-Monotonic ArrayInput: [1, 3, 2]
# Expected Output: false
# Explanation: The array is not monotonic, as 3 > 2 violates the non-decreasing property and 1 < 3 violates the non-increasing property.

# Test Case 4: Single Element ArrayInput: [5]
# Expected Output: true
# Explanation: An array with a single element is always monotonic (both increasing and decreasing).

# Test Case 5: Array with Equal ElementsInput: [4, 4, 4, 4]
# Expected Output: true
# Explanation: The array is monotonic, as all elements are equal (valid for both increasing and decreasing).

# Test Case 6: Empty ArrayInput: []
# Expected Output: true
# Explanation: An empty array is considered monotonic by definition, as there are no elements to violate the property.

# Test Case 7: Array with Negative NumbersInput: [-1, -5, -10, -20]
# Expected Output: true
# Explanation: The array is monotone decreasing, as the elements are non-increasing (-1 ≥ -5 ≥ -10 ≥ -20).

# Test Case 8: Non-Monotonic Array with Negative NumbersInput: [-1, -5, -3, -10]
# Expected Output: false
# Explanation: The array is not monotonic, as -5 < -3 violates the non-increasing property.

def MonotonicArray(input):
    if(len(input) == 0): return True;
    if(len(input) == 1): return True;
    
    n = len(input);
    first = input[0];
    last = n - 1;
    
    if first > last:#IM
        for i in range(n - 1):
            if input[i] < input[i + 1]: return False;
    
    elif first < last:#DM
        for i in range(n - 1):
            if input[i] > input[i + 1]: return False;
    
    elif first == last:#M
        for i in range(n - 1):
            if input[i] != input[i + 1]: return False;
    return True;
        
        
case1 = [1, 2, 2, 3]; #true
case2 = [6, 5, 4, 4]; #true
case3 = [1, 3, 2]; #false
case4 = [5]; #true
case5 = [4, 4, 4, 4]; #true
case6 = []; #true
case7 = [-1, -5, -10, -20]; #true
case8 = [-1, -5, -3, -10]; #false

print(MonotonicArray(case8));