function solve(input) {
    let sentences = [];
    let words = input[0].split(' ');
    for (const word of words) {
        sentences.push({
            [`${word}`]: 0,
        })
    }

    for (let i = 1; i < input.length; i++) {
        const element = input[i];
        for (const word of words) {
            if (element === word) {
                for (const sentence of sentences) {
                    if (Object.keys(sentence).indexOf(`${word}`) > -1) {
                        sentence[`${word}`] = sentence[`${word}`] + 1;
                    }
                }
            }
        }
    }

    let sortedWords = sentences.sort((a,b) => Object.values(b) - Object.values(a));
    for (const currentWord of sortedWords) {
        let key = Object.keys(currentWord);
        console.log(`${key} - ${currentWord[key]}`);
    }
}


solve([
    'this sentence', 
    'In', 'this', 'sentence', 'you', 'have', 'to', 'count', 'the', 'occurrences', 'of', 'the', 'words', 'this', 'and', 'sentence', 'because', 'this', 'is', 'your', 'task'
    ]);