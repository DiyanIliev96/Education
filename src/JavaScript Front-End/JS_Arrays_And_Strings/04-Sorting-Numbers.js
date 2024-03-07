function sortingArrOfNumbers(arr) {
    let sortedArr = [];
    let i = 0;
    while (arr.length !== 0) {
        
        if (i % 2 === 0) {
            let indexOfSmallestNumber = arr.indexOf(Math.min(...arr));
            sortedArr.push(arr[indexOfSmallestNumber]);
            arr.splice(indexOfSmallestNumber,1)
        } else {
            let indexOfLargestNumber = arr.indexOf(Math.max(...arr));
            sortedArr.push(arr[indexOfLargestNumber]);
            arr.splice(indexOfLargestNumber,1);
        }
        i++;
    }
    console.log(sortedArr);
}

sortingArrOfNumbers([1, 65, 3, 52, 48, 63, 31, -3, 18, 56])


function sortNumbers(arr) {
    arr.sort((a,b) => a - b);
    let i = 0;
    let sortedArray = [];
    while (arr.length !== 0) {
        if (i % 2 === 0) {
            let smallestNumber = arr.shift();
            sortedArray.push(smallestNumber);
        } else {
            let biggestNumber = arr.pop();
            sortedArray.push(biggestNumber);
        }
        i++;
    }
    return sortedArray;
}

sortNumbers([1, 65, 3, 52, 48, 63, 31, -3, 18, 56])