//Coding Exercise: Sorted Squared Array
//Question: You are given an array of Integers in which each subsequent value is not less than the previous value.
//Write a function that takes this array as an input and returns a new array with the squares of each number sorted
//in ascending order.

const case1 = [1, 3, 5]; //[1,9,25]
const case2 = [0, 5, 6]; //[0,25,36]
const case3 = [-4, -2, 0, 1, 3]; //[0,1,4,9,16]
const case4 = [5, -1, 2, -10]; //[1, 4, 25, 100]
const case5 = [1, 2, 3, 4, 5]; //[1, 4, 9, 16, 25]
const case6 = [-3, -1, 0, 8]; //[0, 1, 9, 64]

//Using the sort() method
function SortedSquaredArray(input) {
  return input.map((e) => e * e).sort((a, b) => a - b);
}

console.log(SortedSquaredArray(case4));

//Sorting mannualy, using two pointers approach
function SortedSquaredArrayM(input) {
  const n = input.length;
  const newArray = new Array(n);
  let left = 0;
  let rigth = n - 1;
  let write_pointer = n - 1;

  while (write_pointer >= 0) {
    if (Math.abs(input[left]) > Math.abs(input[rigth])) {
      newArray[write_pointer] = input[left] * input[left];
      left++;
    } else {
      newArray[write_pointer] = input[rigth] * input[rigth];
      rigth--;
    }
    write_pointer--;
  }

  return newArray;
}

console.log(SortedSquaredArrayM(case1));
