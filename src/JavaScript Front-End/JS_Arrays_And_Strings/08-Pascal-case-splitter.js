function pascalSplitter(inputString) {
    let wordsArray = inputString.split(/(?=[A-Z])/);
    console.log(wordsArray.join(', '));
}

pascalSplitter('SplitMeIfYouCanHaHaYouCantOrYouCan');