function sumDigits(number) {
    const numberSum = number
    .toString()
    .split("")
    .map((a) => parseInt(a))
    .reduce((a, b) => a + b, 0)
    
    console.log(numberSum)
}

sumDigits('245678')