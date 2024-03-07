function findWordsStartWithHashTag(inputString) {
    let inputStringToArray = inputString.split(' ');
    let wordsWithHashTagArray = [];
    for (let i = 0; i < inputStringToArray.length; i++) {
        let currentWord = inputStringToArray[i];
        if (currentWord.startsWith('#') && currentWord.length !== 1 && !currentWord.match(/\d/)) {
            wordsWithHashTagArray.push(currentWord);
        }
    }
    for (const word of wordsWithHashTagArray) {
        console.log(word.replace('#',''));
    }
}

findWordsStartWithHashTag('The symbol # is known #variously in English-speaking #regions as the #number sign')