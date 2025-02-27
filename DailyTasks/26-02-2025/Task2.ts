let age: number=21;
age=22;
const country: string='India';
var city: string="Hyderabad";
city='Bangalore';
function testScope(){
    if(true){
        let letScoped = 'Let Variable';
        const constScoped = 'Const Variable';
        var varScoped = 'Var Variable';
        console.log(letScoped); 
        console.log(constScoped); 
        console.log(varScoped); 
    }
    //console.log(letScoped);
     //console.log(constScoped);
    console.log("function scoping "+varScoped);
      
}
testScope();

// Output the values
console.log('Age:', age);
console.log('Country:', country);
console.log('City:', city);
