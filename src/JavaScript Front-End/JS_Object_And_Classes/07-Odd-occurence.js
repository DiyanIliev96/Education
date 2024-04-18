function solve(input) {
    let wordsArray = input.split(' ');
    let wordsOccurrences = {};

    for (let currentWord of wordsArray) {
        if (!wordsOccurrences[`${currentWord.toLowerCase()}`]) {
            wordsOccurrences[currentWord.toLowerCase()] = 1;
        } else {
            wordsOccurrences[`${currentWord.toLowerCase()}`] += 1;
        }

    }


    let words = [];
    for (const key of Object.keys(wordsOccurrences)) {
       if (wordsOccurrences[key] % 2 === 1) {
        words.push(key); 
       }
    }
    console.log(words.join(' '))
}

solve ('Java C# Php PHP Java PhP 3 C# 3 1 5 C#');