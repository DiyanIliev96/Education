function sortNames(namesArray) {
   namesArray.sort((a,b) => a.localeCompare(b))
    for (let i = 0; i < namesArray.length; i++) {
        console.log(`${i + 1}.${namesArray[i]}`);
    }
}

sortNames(["Aab","Aac","Aaa"])