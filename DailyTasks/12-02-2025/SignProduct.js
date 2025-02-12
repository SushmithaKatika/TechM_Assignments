function findSign(num1, num2, num3) {
    let product = num1 * num2 * num3;
    let sign = product > 0 ? "+" : "-";
    alert(`The sign is ${sign}`);
}

findSign(3, -7, 2); 
findSign(-4, -2, 5); 
