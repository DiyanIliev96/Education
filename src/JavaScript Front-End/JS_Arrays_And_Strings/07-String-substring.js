function findAWord(searchingWord,inputString) {
    let isFound = false;
    let inputStringToArray = inputString.split(' ');

    for (let i = 0; i < inputStringToArray.length; i++) {
        isFound = searchingWord.toLowerCase().includes(`${inputStringToArray[i].toLowerCase()}`)
        if (isFound) {
            console.log(`${searchingWord}`);
            return;
        }
        
    }
    console.log(`${searchingWord} not found!`);
}

findAWord('javascript',
'JavaScript is the best programming language')