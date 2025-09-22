//Coding Exercise: Monotonic Array
//Question: An array is monotonic if it is either monotone increasing or monotone decreasing.
//An array is monotone increasing if all its elements from left to right are non-decreasing.
//An array is monotone decreasing if all  its elements from left to right are non-increasing.
//Given an integer array return true if the given array is monotonic, or false otherwise.

//Test Case 1: Monotone Increasing ArrayInput: [1, 2, 2, 3]
//Expected Output: true
//Explanation: The array is monotone increasing, as the elements are non-decreasing (1 ≤ 2 ≤ 2 ≤ 3).

//Test Case 2: Monotone Decreasing ArrayInput: [6, 5, 4, 4]
//Expected Output: true
//Explanation: The array is monotone decreasing, as the elements are non-increasing (6 ≥ 5 ≥ 4 ≥ 4).

//Test Case 3: Non-Monotonic ArrayInput: [1, 3, 2]
//Expected Output: false
//Explanation: The array is not monotonic, as 3 > 2 violates the non-decreasing property and 1 < 3 violates the non-increasing property.

//Test Case 4: Single Element ArrayInput: [5]
//Expected Output: true
//Explanation: An array with a single element is always monotonic (both increasing and decreasing).

//Test Case 5: Array with Equal ElementsInput: [4, 4, 4, 4]
//Expected Output: true
//Explanation: The array is monotonic, as all elements are equal (valid for both increasing and decreasing).

//Test Case 6: Empty ArrayInput: []
//Expected Output: true
//Explanation: An empty array is considered monotonic by definition, as there are no elements to violate the property.

//Test Case 7: Array with Negative NumbersInput: [-1, -5, -10, -20]
//Expected Output: true
//Explanation: The array is monotone decreasing, as the elements are non-increasing (-1 ≥ -5 ≥ -10 ≥ -20).

//Test Case 8: Non-Monotonic Array with Negative NumbersInput: [-1, -5, -3, -10]
//Expected Output: false
//Explanation: The array is not monotonic, as -5 < -3 violates the non-increasing property.

function MonotonicArray(array) {
  if (array.length == 0 || array.length == 1) return true;
  let first = array[0];
  let last = array[array.length - 1];

  if (first > last) {
    for (let i = 0; i < array.length; i++) {
      if (array[i] < array[i + 1]) return false;
    }
  } else if (first < last) {
    for (let i = 0; i < array.length; i++) {
      if (array[i] > array[i + 1]) return false;
    }
  } else if (first == last) {
    for (let i = 0; i < array.length; i++) {
      console.log(array[i], array[i + 1]);

      if (array[i] != array[i + 1]) return false;
    }
  }

  return true;
}

const case1 = [1, 2, 2, 3]; //true
const case2 = [6, 5, 4, 4]; //true
const case3 = [1, 3, 2]; //false
const case4 = [5]; //true
const case5 = [4, 4, 4, 4]; //true
const case6 = []; //true
const case7 = [-1, -5, -10, -20]; //true
const case8 = [-1, -5, -3, -10]; //false

console.log(MonotonicArray(case5));
