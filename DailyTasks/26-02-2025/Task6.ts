let inferredValue = 'Hello, TypeScript!';
// inferredValue = 42; // Error: Type 'number' is not assignable to type 'string'
console.log('Inferred Value:', inferredValue);

// Type assertions
let unknownValue: any = '123';
let stringLength: number = (unknownValue as string).length;
console.log('String Length:', stringLength);

// Type conversion using parseInt
let numericString: string = '456';
let convertedNumber: number = parseInt(numericString);
console.log('Converted Number:', convertedNumber);
