function palindrome(numbers){
    for (let num of numbers) {
        let current = num.toString();
        let currentRev = num.toString().split("").reverse().join("")
        if (current === currentRev) {
            console.log(true)
        } else {
            console.log(false)
        }
    }
}

