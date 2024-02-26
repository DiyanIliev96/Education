function  circleArea(radius) {
    if (typeof radius !== 'number') {
        console.log(`We can not calculate the circle area, because we receive a ${typeof radius}.`)
    } else {
        let circleArea = (Math.pow(radius, 2)) * Math.PI
        console.log(circleArea.toFixed(2));
    }
}

circleArea('name')
circleArea(5)