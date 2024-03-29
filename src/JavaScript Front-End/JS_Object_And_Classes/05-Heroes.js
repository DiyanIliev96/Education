function solve(input) {
    let heroes = [];
    for (const currentLine of input) {
        let heroInfo = currentLine.split(' / ');
        let name = heroInfo[0];
        let level = heroInfo[1];
        let items = heroInfo[2];
        heroes.push({
            name: name,
            level: Number(level),
            items: items,
        })
    }
    let sortedHeroes = heroes.sort((a,b) => a.level - b.level);
    for (const hero of sortedHeroes) {
        console.log(`Hero: ${hero.name}`);
        console.log(`level => ${hero.level}`);
        console.log(`items => ${hero.items}`);
    }
}

solve([
    'Isacc / 25 / Apple, GravityGun',
    'Derek / 12 / BarrelVest, DestructionSword',
    'Hes / 1 / Desolator, Sentinel, Antara'
    ]);