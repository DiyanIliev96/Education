function solve(input) {
    let parking = [];
    for (const currentLine of input) {
        let direction = currentLine.split(', ')[0];
        let carNumber = currentLine.split(', ')[1];
        switch (direction) {
            case 'IN':
                let isExist = false;
                for (const car of parking) {
                    if (car.carNumber === carNumber) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    parking.push({
                        carNumber: carNumber,
                    })
                }
                break;
        
            case 'OUT':
                for (let i = 0; i < parking.length; i++) {
                    if (parking[i].carNumber === carNumber) {
                        parking.splice(i,1);
                    }
                    
                }
                break;
        }
    }

    if (parking.length === 0) {
        console.log(`Parking Lot is Empty`);
    } else {
        let sortedParking = parking.sort((a,b) => a.carNumber.localeCompare(b.carNumber))
        for (const currentCar of sortedParking) {
            console.log(currentCar.carNumber);
        }
    }
}

solve(['IN, CA2844AA',
'IN, CA1234TA',
'OUT, CA2844AA',
'IN, CA9999TT',
'IN, CA2866HI',
'OUT, CA1234TA',
'IN, CA2844AA',
'OUT, CA2866HI',
'IN, CA9876HH',
'IN, CA2822UU']);