function calculateFruitPrice(fruit,weight,pricePerKg) {
    let weigthToKilograms = (weight / 1000);
    let moneyRequired = (weigthToKilograms * pricePerKg);
    console.log(`I need $${moneyRequired.toFixed(2)} to buy ${weigthToKilograms.toFixed(2)} kilograms ${fruit}.`)
}

calculateFruitPrice('apple', 1563, 2.35)