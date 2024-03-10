function addEvenAndOddSum(number) {
    let evenSum = 0;
    let oddSum = 0;
    let numberToArray = number.toString().split('').map(n => parseInt(n))
    function even(numberArr) {
        let sum = 0;
        for (const num of numberArr) {
            if (num % 2 === 0) {
                sum += num;
            }
        }
        return sum;
    }

    function odd (numberArr) {
        let sum = 0;
        for (const num of numberArr) {
            if (num % 2 !== 0) {
                sum += num;
            }
        }
        return sum;
    }

    oddSum = odd(numberToArray);
    evenSum = even(numberToArray);
    console.log(`Odd sum = ${oddSum}, Even sum = ${evenSum}`);
}

addEvenAndOddSum(10000);