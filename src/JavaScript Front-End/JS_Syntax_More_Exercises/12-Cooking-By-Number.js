function cookingByNumber(number,firstStep,secondStep,thirdStep,fourthStep,fifthStep) {
    let stepsArray = [firstStep,secondStep,thirdStep,fourthStep,fifthStep];
    let numberToManipulate = number;
    for (let i = 0; i < stepsArray.length; i++) {
        switch (stepsArray[i]) {
            case 'chop':
            numberToManipulate = numberToManipulate / 2;
                break;
            case 'dice':
            numberToManipulate = Math.sqrt(numberToManipulate);
                break;

            case 'spice':
            numberToManipulate = numberToManipulate + 1;
                break;

            case 'bake':
            numberToManipulate = numberToManipulate * 3;
                break;

            case 'fillet':
            numberToManipulate = numberToManipulate - (numberToManipulate * 0.2);
                break;
        }
        console.log(numberToManipulate);
    }

}

cookingByNumber('32', 'chop', 'chop', 'chop', 'chop', 'chop')