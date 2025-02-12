function CurrentDateTime() {
    let today=new Date();
    let days=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
    let dayName=days[today.getDay()];

    let hours= today.getHours();
    let minutes=today.getMinutes();
    let seconds=today.getSeconds();
    
    let amPm=hours>=12?"PM":"AM";
    hours=hours%12 || 12;

    let dayString=`Today is: ${dayName}`;
    let timeString=`Current time is: ${hours} ${amPm} : ${minutes} : ${seconds}`;

    console.log(dayString);
    console.log(timeString);
}
CurrentDateTime(); 