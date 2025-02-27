// Declare an array of type 'string'
let fruits: string[] = ['Apple', 'Banana', 'Cherry'];

// Add elements to the array
fruits.push('Dragonfruit'); // Add to the end
fruits.unshift('Mango'); // Add to the beginning
console.log('After adding elements:', fruits);

// Remove elements from the array
const removedFruit = fruits.pop(); // Remove from the end
console.log('Removed from the end:', removedFruit);

const shiftedFruit = fruits.shift(); // Remove from the beginning
console.log('Removed from the beginning:', shiftedFruit);

console.log('After removing elements:', fruits);

console.log('iterating through the array');
for (const fruit of fruits) {
    console.log(fruit);
}
