function loadingBar(number) {
    if (number === 100) {
        console.log(`100% Complete!`);
        console.log(`[%%%%%%%%%%]`)
    } else {
        let loadingBar = [`.`,`.`,`.`,`.`,`.`,`.`,`.`,`.`,`.`,`.`];
        let loadedBars = number / 10;
        for (let i = 0; i < loadedBars; i++) {
            loadingBar[i] = '%';
        }
        console.log(`${number}% [${loadingBar.join('')}]`)
        console.log(`Still loading...`)
    }


}

loadingBar(100);