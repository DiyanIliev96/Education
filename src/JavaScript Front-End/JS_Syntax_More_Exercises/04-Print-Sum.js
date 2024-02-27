function printAndSum(startNumber,endNumber) {
    let stringNumbers = "";
    let sum = 0;
    for (let i = startNumber; i <= endNumber; i++) {
        stringNumbers += i + ' ';
        sum += i;
        
    }
    console.log(stringNumbers)
    console.log(`Sum: ${sum}`)
}

printAndSum(5,10)