function towns(input) {
    let townsInfo = {};

    for (const town of input) {
        const [name,latitude,longtitute] = town.split(' | ');
        townsInfo['town'] = name;
        townsInfo['latitude'] = parseFloat(latitude).toFixed(2);
        townsInfo['longitude'] = parseFloat(longtitute).toFixed(2);
        console.log(townsInfo);
    }
    
}

towns(['Sofia | 42.696552 | 23.32601',
'Beijing | 39.913818 | 116.363625'])