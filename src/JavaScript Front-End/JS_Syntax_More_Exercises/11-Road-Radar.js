function isSpeedLegal(speed, place) {
    let limitSpeed = 0;
    switch (place) {
        case 'city':
            limitSpeed = 50;
            break;
        case 'residential':
            limitSpeed = 20;
            break;
        case 'interstate':
            limitSpeed = 90;
            break;
        case 'motorway':
            limitSpeed = 130;
            break;
    }

    if (speed > limitSpeed) {
        const difference = speed - limitSpeed;
        if (difference <= 20) {
            console.log(`The speed is ${difference} km/h faster than the allowed speed of ${limitSpeed} - speeding`)
        } else if (difference > 20 && difference <= 40) {
            console.log(`The speed is ${difference} km/h faster than the allowed speed of ${limitSpeed} - excessive speeding`)
        } else {
            console.log(`The speed is ${difference} km/h faster than the allowed speed of ${limitSpeed} - reckless driving`)
        }
    } else {
        console.log(`Driving ${speed} km/h in a ${limitSpeed} zone`)
    }
}

isSpeedLegal(120, 'interstate')