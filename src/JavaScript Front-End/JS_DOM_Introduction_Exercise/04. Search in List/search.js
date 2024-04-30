function search() {
   let buttonInput = document.getElementById('searchText').value;
   const towns = document.getElementById('towns').getElementsByTagName('li');
   const result = document.getElementById('result');
   let matches = 0;
   for (const town of towns) {
      if (town.textContent.toLocaleLowerCase().includes(buttonInput.toLocaleLowerCase())) {
         town.style.textDecoration = "underline";
         town.style.fontWeight = "bold";
         matches++;
      }
   }
   result.textContent = `${matches} matches found`;
}
