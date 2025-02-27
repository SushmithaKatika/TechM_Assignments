var age = 21;
age = 22;
var country = 'India';
var city = "Hyderabad";
city = 'Bangalore';
function testScope() {
    if (true) {
        var letScoped = 'Let Variable';
        var constScoped = 'Const Variable';
        var varScoped = 'Var Variable';
        console.log(letScoped);
        console.log(constScoped);
        console.log(varScoped);
    }
    //console.log(letScoped);
    //console.log(constScoped);
    console.log("function scoping " + varScoped);
}
testScope();
// Output the values
console.log('Age:', age);
console.log('Country:', country);
console.log('City:', city);
