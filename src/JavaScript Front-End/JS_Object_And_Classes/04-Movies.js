function solve(input) {
    let movies = [];

    for (const currentLine of input) {
        if (currentLine.includes('addMovie')) {
            let movieInfo = currentLine.split('addMovie ');
            movies.push({name: movieInfo[1]});
        } else if (currentLine.includes('directedBy')) {
            let movieAndDirector = currentLine.split(' directedBy ');
            let movieName = movieAndDirector[0];
            let directorName = movieAndDirector[1];
            for (const currentMovie of movies) {
                if (Object.values(currentMovie).indexOf(`${movieName}`) > -1) {
                    currentMovie.director = directorName;
                }
            }
        } else if (currentLine.includes('onDate')) {
            let movieAndDate = currentLine.split(' onDate ');
            let movieName = movieAndDate[0];
            let date = movieAndDate[1];
            for (const currentMovie of movies) {
                if (Object.values(currentMovie).indexOf(`${movieName}`) > -1) {
                    currentMovie.date = date;
                }
            }
        }
    }
    let moviesWithAllInfo = [];
    for (const movieObj of movies) {
        if (Object.values(movieObj).length === 3) {
            moviesWithAllInfo.push(movieObj);
        }
    }

    for (const movie of moviesWithAllInfo) {
        console.log(JSON.stringify(movie));
    }
}

solve([
    'addMovie The Avengers',
    'addMovie Superman',
    'The Avengers directedBy Anthony Russo',
    'The Avengers onDate 30.07.2010',
    'Captain America onDate 30.07.2010',
    'Captain America directedBy Joe Russo'
    ]);