function factorialDivision(numberOne,numberTwo) {
    let firstFactorial = 1;
    let secondFactorial = 1;
    for (let i = numberOne; i >= 1; i--) {
        firstFactorial *= i;
    }

    for (let j = numberTwo; j >= 1; j--) {
        secondFactorial *= j;
    }

    let result = firstFactorial / secondFactorial;
    console.log(result.toFixed(2));
}

factorialDivision(5,2);