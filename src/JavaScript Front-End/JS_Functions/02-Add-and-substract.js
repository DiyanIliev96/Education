function sumAndSubstract(numberOne,numberTwo,numberThree) {
    function sum(num1,num2) {
        return num1 + num2;
    }
    
    function substract(sum,num3) {
        return sum - num3;
    }
    let result = sum(numberOne,numberTwo)
    result = substract(result,numberThree);
    console.log(result);
}



sumAndSubstract(23,6,10);