// Define a class called 'Bus' with properties and a method
var Bus = /** @class */ (function () {
    // Constructor to initialize the properties when a Bus object is created
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Method to start the bus
    Bus.prototype.start = function () {
        console.log("The ".concat(this.year, " ").concat(this.make, " ").concat(this.model, " bus is starting..."));
    };
    return Bus;
}());
// Create an instance of the 'Bus' class
var objBus = new Bus('TATA', 'Starbus Ultra', 2022);
// Call the 'start' method to indicate the bus is starting
objBus.start();
