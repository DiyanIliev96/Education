function charactersInRange(startChar,endChar) {
    let start = startChar.charCodeAt(0);
    let end = endChar.charCodeAt(0);

    function charsInRange(start,end) {
        let chars = [];
        if (start < end) {
            for (let i = start + 1; i < end; i++) {
                let currentChar = String.fromCharCode(i);
                chars.push(currentChar);
            }
        } else {
            for (let i = end + 1; i < start; i++) {
                let currentChar = String.fromCharCode(i);
                chars.push(currentChar);
            }
        }
        return chars;
    }
    let result = charsInRange(start,end).join(' ');
    console.log(result);
}

charactersInRange('C','#')