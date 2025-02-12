function daysUntilChristmas() {
    let today = new Date(); 
    let year = today.getFullYear(); 
    let christmas = new Date(year, 11, 25);

    if (today > christmas) {
        christmas = new Date(year + 1, 11, 25);
    }
   let diff = christmas - today;
    
    let daysLeft = Math.ceil(diff / (1000 * 60 * 60 * 24));

    console.log(`Days left until Christmas: ${daysLeft}`);
}

daysUntilChristmas();
