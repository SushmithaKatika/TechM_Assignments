let year = 2014;

console.log("Years when January 1st is a Sunday:");
while (year <= 2050) {
    if (new Date(year, 0, 1).getDay() === 0) {
        console.log(year);
        year += 6;
    } else {
        year++; 
    }
}
