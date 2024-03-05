function sameNumbers(numbers) {
    let isSameNumbers = true;
    let numbersArray = numbers.toString().split('');
    let sum = 0;
    for (let i = 0; i < numbersArray.length; i++) {
        let currentNumber = numbersArray[i];
        if (i > 0 && i < numbersArray.length - 1) {
            if (isSameNumbers) {
                if (currentNumber !== numbersArray[i + 1]) {
                    isSameNumbers = false;
                }
            }
        }
        sum += parseInt(currentNumber);
    }
    console.log(isSameNumbers);
    console.log(sum)
}

sameNumbers(2222222)