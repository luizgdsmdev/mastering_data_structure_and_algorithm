//7° CHALLANGE
//Given an integer array (ex: [-2, 1, -3, 4, -1, 2, 1, -5, 4]), you must find the
//maximum continuous subarray (containing at least one element)
//which has the largest sum, and the return is the sum
//Example:
//input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Output: 6
//continuous subarray: [4, -1, 2, 1] has the largest sum: 6

// Case 1: Mixed positive and negative numbersInput: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
// Output: 6
// Subarray: [4, -1, 2, 1]

// Case 2: All negative numbersInput: [-2, -3, -1, -5]
// Output: -1
// Subarray: [-1]

// Case 3: Single elementInput: [5]
// Output: 5
// Subarray: [5]

// Case 4: All positive numbersInput: [1, 2, 3, 4]
// Output: 10
// Subarray: [1, 2, 3, 4]

// Case 5: Maximum sum at the startInput: [5, 4, -10, 2, 3]
// Output: 9
// Subarray: [5, 4]

// Case 6: Mixed numbers with maximum sumInput: [3, -2, 5, -1, -2, 6, -3]
// Output: 9
// Subarray: [3, -2, 5, -1, -2, 6]

// Case 7: Maximum sum at the endInput: [-3, -2, 1, 5, 6]
// Output: 12
// Subarray: [1, 5, 6]

// Case 8: Zeros and negative numbersInput: [-2, 0, -1, 0, -3]
// Output: 0
// Subarray: [0]

const case1 = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
const case2 = [-2, -3, -1, -5];
const case3 = [5];
const case4 = [1, 2, 3, 4];
const case5 = [5, 4, -10, 2, 3];
const case6 = [3, -2, 5, -1, -2, 6, -3];
const case7 = [-3, -2, 1, 5, 6];
const case8 = [-2, 0, -1, 0, -3];

function findSubArray(input) {
  if (input.length === 0) return null;
  if (input.length === 1) return { Output: input[0], subarray: [input[0]] };

  let max_count = input[0];
  let curr_count = input[0];

  for (let i = 1; i < input.length; i++) {
    if (input[i] > max_count + input[i]) {
      max_count = input[i];
      head = i;
    } else {
      max_count += input[i];
    }

    if (curr_count > max_count) {
      curr_count = curr_count;
      tail = i - 1;
    } else {
      curr_count = max_count;
      tail = i;
    }
  }

  return curr_count;
}

console.log(findSubArray(case4));
