# 1. Two Sum
# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.


# Example 1:
# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

# Example 2:
# Input: nums = [3,2,4], target = 6
# Output: [1,2]
# Example 3:

# Input: nums = [3,3], target = 6
# Output: [0,1]
 
# Constraints:
# 2 <= nums.length <= 104
# -109 <= nums[i] <= 109
# -109 <= target <= 109
# Only one valid answer exists.
 
# Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


# Runtime: 0ms Beats: 100.00%
# Memory: 18.74MB - Beats: 62.06%

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {nums[0]:0}
        for i in range(1,len(nums)):
            if dict.get(target - nums[i],None) != None:
                return [dict.get(target - nums[i]),i]
            dict[nums[i]] = i
            
            
solution = Solution();
result = solution.twoSum([2, 7, 11, 15], 26)
print(result)