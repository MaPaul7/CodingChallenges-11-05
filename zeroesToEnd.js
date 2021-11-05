function zeroesToEnd(arr){
  let numZeroes = 0;
  for(let i = 0; i < arr.length; i++){
    if(arr[i] == 0){
      arr.splice(i, 1);
      i--;
      numZeroes++;
    }
  }
  for(let i = 0; i < numZeroes; i++){
    arr.push(0);
  }
  console.log(arr);
}
zeroesToEnd([1, 2, 0, 0, 4, 0, 5])
zeroesToEnd([0, 0, 2, 0, 5])
zeroesToEnd([4, 4, 5])
zeroesToEnd([0, 0])
