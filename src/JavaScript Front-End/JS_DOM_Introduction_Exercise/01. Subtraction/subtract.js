function subtract() {
    const firstNumber = document.getElementById('firstNumber').value;
    const secondNumber = document.getElementById('secondNumber').value;
    const sum = Number(firstNumber) - Number(secondNumber);
    const result = document.getElementById('result');

    result.textContent = sum;
}