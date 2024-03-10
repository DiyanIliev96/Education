function findSmallestNumber(numberOne, numberTwo, numberThree) {
    let smallestNumber = Number.MAX_SAFE_INTEGER;
    let numbersArray = [numberOne, numberTwo, numberThree];

    for (const num of numbersArray) {
        if (num < smallestNumber) {
            smallestNumber = num;
        }
    }

    console.log(smallestNumber);
}

findSmallestNumber(2,5,3);