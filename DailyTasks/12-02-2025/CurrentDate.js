function currentDate() {

    let today=new Date();
    let date=today.getDate();
    let month=today.getMonth();
    let year=today.getFullYear();

    date = date < 10 ? "0" + date : date;
    month = month < 10 ? "0" + month : month;

    console.log(`${date}/${month}/${year}`);
}
currentDate();