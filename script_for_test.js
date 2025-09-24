var longestCommonPrefix = function (strs) {
  if (strs.length <= 1) return "" + strs;

  let start = 0;
  let final = 1;
  let stringReturn = "";
  let controller = false;

  for (let i = 0; i < strs[start].length; i++) {
    if (strs[final][i] == strs[start][i]) {
      stringReturn += strs[start][i];
    } else {
      break;
    }
  }

  while (start < final) {
    if (
      !strs[start].includes(stringReturn) &&
      !strs[final].includes(stringReturn)
    ) {
      controller = true;
    }

    start++;
    final--;
  }

  return controller ? "" : stringReturn;
};

strs = ["flower", "flow", "flight"];
//["cir", "car"]; "c"
//["c","c"]; "c"
//["flower", "flower","flower","flower","flower"]; "flower"
//["a"]; "a"
//["aa","ab"]; "a"
//["aa","aa"]; "aa"
//["aaa", "aa", "aaa"]; "aa"

console.log(longestCommonPrefix(strs));
