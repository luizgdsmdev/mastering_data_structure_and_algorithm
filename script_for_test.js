let array = [1, 2, 3, 4, 5];

function teste(index, finalIndex) {
  let start = index;
  let final = finalIndex;

  while (start < final) {
    let temp = array[finalIndex];
    array[finalIndex] = array[index];
    array[index] = temp;

    index++;
    finalIndex--;
  }
}
teste(2, 3);
console.log(array);
