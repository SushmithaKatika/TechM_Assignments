function LeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
}
let year=2000;
if(LeapYear(year)){
    console.log("leap year");
}
else{
    console.log("not leap year");
}

