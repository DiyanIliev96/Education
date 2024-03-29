function solve(firstArray,secondArray) {
    let products = {};
    for (let i = 0; i < firstArray.length; i+=2) {
        products[firstArray[i]] = Number(firstArray[i + 1]);
    }

    for (let j = 0; j < secondArray.length; j+= 2) {
        if (products[`${secondArray[j]}`]) {
            products[`${secondArray[j]}`] = products[`${secondArray[j]}`] + Number(secondArray[j + 1])
        } else {
            products[secondArray[j]] = Number(secondArray[j + 1])
        }
        
    }
    for (const product in products) {
        console.log(`${product} -> ${products[product]}`);
    }
}

solve([
    'Chips', '5', 'CocaCola', '9', 'Bananas', '14', 'Pasta', '4', 'Beer', '2'
    ],
    [
    'Flour', '44', 'Oil', '12', 'Pasta', '7', 'Tomatoes', '70', 'Bananas', '30'
    ])