var inferredValue = 'Hello, TypeScript!';
// inferredValue = 42; // Error: Type 'number' is not assignable to type 'string'
console.log('Inferred Value:', inferredValue);
// Type assertions
var unknownValue = '123';
var stringLength = unknownValue.length;
console.log('String Length:', stringLength);
// Type conversion using parseInt
var numericString = '456';
var convertedNumber = parseInt(numericString);
console.log('Converted Number:', convertedNumber);
