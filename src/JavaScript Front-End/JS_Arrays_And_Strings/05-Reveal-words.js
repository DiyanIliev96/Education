function revealWords(replacingWords,secondWord) {
    let replacingWordsArray = replacingWords.split(', ');
    for (let i = 0; i < replacingWordsArray.length; i++) {
        let replacingWord = replacingWordsArray[i];
        let stringToReplace = '*'.repeat(replacingWord.length);
        secondWord = secondWord.replace(stringToReplace,replacingWord);
    }
    console.log(secondWord);
}

revealWords('great, learning',
'softuni is ***** place for ******** new programming languages')