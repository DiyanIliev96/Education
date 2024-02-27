function vacationCalc(persons, type, dayOfWeekend) {
    let totalPrice = 0;
    let pricePerPerson = 0;
    switch (type) {
        case 'Students':
            if (dayOfWeekend === 'Friday') {
                pricePerPerson = 8.45;
            } else if (dayOfWeekend === 'Saturday') {
                pricePerPerson = 9.80;
            } else if (dayOfWeekend === 'Sunday') {
                pricePerPerson = 10.46
            }
            break;
        case 'Business':
            if (dayOfWeekend === 'Friday') {
                pricePerPerson = 10.90;
            } else if (dayOfWeekend === 'Saturday') {
                pricePerPerson = 15.60;
            } else if (dayOfWeekend === 'Sunday') {
                pricePerPerson = 16
            }
            break;
        case 'Regular':
            if (dayOfWeekend === 'Friday') {
                pricePerPerson = 15;
            } else if (dayOfWeekend === 'Saturday') {
                pricePerPerson = 20;
            } else if (dayOfWeekend === 'Sunday') {
                pricePerPerson = 22.50;
            }
            break;
    }
    totalPrice = persons * pricePerPerson;

    if (type === 'Students' && persons >= 30) {
        totalPrice = totalPrice - (totalPrice * 0.15);
    } else if (type === 'Business' && persons >= 100) {
        totalPrice = pricePerPerson * (persons - 10);
    } else if (type === 'Regular' && persons >= 10 && persons <= 20) {
        totalPrice = totalPrice - (totalPrice * 0.05);
    }

    console.log(`Total price: ${totalPrice.toFixed(2)}`)
}

vacationCalc(30,'Students','Sunday')