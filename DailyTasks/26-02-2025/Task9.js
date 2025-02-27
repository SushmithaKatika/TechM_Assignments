// Define the 'Color' enumeration
var Color;
(function (Color) {
    Color["Red"] = "Red";
    Color["Green"] = "Green";
    Color["White"] = "White";
    Color["Blue"] = "Blue";
})(Color || (Color = {}));
// Create a variable of type 'Color' and assign an enum value
var selectedColor = Color.Green;
console.log('Selected Color:', selectedColor);
