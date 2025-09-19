#7° CHALLANGE
#Given an integer array (ex: [-2, 1, -3, 4, -1, 2, 1, -5, 4]), you must find the
#maximum continuous subarray (containing at least one element)
#which has the largest sum, and the return is the sum
#Example:
#input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
#Output: 6
#continuous subarray: [4, -1, 2, 1] has the largest sum: 6

# Case 1: Mixed positive and negative numbersInput: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
# Output: 6
# Subarray: [4, -1, 2, 1]

# Case 2: All negative numbersInput: [-2, -3, -1, -5]
# Output: -1
# Subarray: [-1]

# Case 3: Single elementInput: [5]
# Output: 5
# Subarray: [5]

# Case 4: All positive numbersInput: [1, 2, 3, 4]
# Output: 10
# Subarray: [1, 2, 3, 4]

# Case 5: Maximum sum at the startInput: [5, 4, -10, 2, 3]
# Output: 9
# Subarray: [5, 4]

# Case 6: Mixed numbers with maximum sumInput: [3, -2, 5, -1, -2, 6, -3]
# Output: 9
# Subarray: [3, -2, 5, -1, -2, 6]

# Case 7: Maximum sum at the endInput: [-3, -2, 1, 5, 6]
# Output: 12
# Subarray: [1, 5, 6]

# Case 8: Zeros and negative numbersInput: [-2, 0, -1, 0, -3]
# Output: 0
# Subarray: [0]

import math


case1 = [-2, 1, -3, 4, -1, 2, 1, -5, 4]; #[4, -1, 2, 1]
case2 = [-2, -3, -1, -5]; #[-1]
case3 = [5]; #[5]
case4 = [1, 2, 3, 4]; #[1, 2, 3, 4]
case5 = [5, 4, -10, 2, 3]; #[5, 4]
case6 = [3, -2, 5, -1, -2, 6, -3]; #[3, -2, 5, -1, -2, 6]
case7 = [-3, -2, 1, 5, 6]; #[1, 5, 6]
case8 = [-2, 0, -1, 0, -3]; #[0]

def MaximumSubarray(array):
    sum = array[0];
    current = array[0];
    head = 0;
    tail = 0;
    finalHead = 0;
    subArray = [];
    
    for i in range(1, len(array)):
        if(array[i] > (sum + array[i])):
            sum = array[i];
            head = i;
        else:
            sum = sum + array[i];
        
        if(current < sum):
            current = sum;
            tail = i;
            finalHead = head;
    subArray = array[finalHead:tail+1];
            
        
    return {"Sum": current, "SubArray": subArray}

print(MaximumSubarray(case4));