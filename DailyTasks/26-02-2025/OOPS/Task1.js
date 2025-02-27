// Define a class called 'Bus' with properties and a constructor
var Bus = /** @class */ (function () {
    // Constructor to initialize the properties when an object is created
    function Bus(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Method to display bus details
    Bus.prototype.displayInfo = function () {
        console.log("Bus Make: ".concat(this.make));
        console.log("Bus Model: ".concat(this.model));
        console.log("Manufacturing Year: ".concat(this.year));
    };
    return Bus;
}());
var objBus = new Bus('TATA', 'Starbus Ultra', 2022);
objBus.displayInfo();
