function solve() {
  const text = document.getElementById('text').value;
  const convention = document.getElementById('naming-convention').value;
  const textToArray = text.split(' ');
  let result = document.getElementById('result');

  switch (convention) {
    case 'Camel Case':
      let firstWordToLowerCase = textToArray[0].toLowerCase();
      textToArray[0] = firstWordToLowerCase;
      for (let i = 1; i < textToArray.length; i++) {
          let word = textToArray[i].toLowerCase().split('');
          word[0] = word[0].toUpperCase();
          textToArray[i] = word.join('');
      }
      break;

    case 'Pascal Case':
      for (let i = 0; i < textToArray.length; i++) {
        let word = textToArray[i].toLowerCase().split('');
        word[0] = word[0].toUpperCase();
        textToArray[i] = word.join('');
      }
      break;

    default:
      result.textContent = "Error!";
      return;
  }

  
  result.textContent = textToArray.join('');
}