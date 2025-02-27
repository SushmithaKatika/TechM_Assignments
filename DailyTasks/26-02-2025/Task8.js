// Declare an array of type 'string'
var fruits = ['Apple', 'Banana', 'Cherry'];
// Add elements to the array
fruits.push('Dragonfruit'); // Add to the end
fruits.unshift('Mango'); // Add to the beginning
console.log('After adding elements:', fruits);
// Remove elements from the array
var removedFruit = fruits.pop(); // Remove from the end
console.log('Removed from the end:', removedFruit);
var shiftedFruit = fruits.shift(); // Remove from the beginning
console.log('Removed from the beginning:', shiftedFruit);
console.log('After removing elements:', fruits);
console.log('iterating through the array');
for (var _i = 0, fruits_1 = fruits; _i < fruits_1.length; _i++) {
    var fruit = fruits_1[_i];
    console.log(fruit);
}
