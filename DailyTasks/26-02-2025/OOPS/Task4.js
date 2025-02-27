var Engine = /** @class */ (function () {
    function Engine(horsepower, fuelType) {
        this.horsepower = horsepower;
        this.fuelType = fuelType;
    }
    return Engine;
}());
var Car = /** @class */ (function () {
    function Car(make, model, year, engine) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    Car.prototype.start = function () {
        console.log("".concat(this.make, " ").concat(this.model, " is starting..."));
    };
    Car.prototype.printCarDetails = function () {
        console.log("Car: ".concat(this.make, " ").concat(this.model, " (").concat(this.year, ")"));
        console.log("Engine: ".concat(this.engine.horsepower, " HP, Fuel Type: ").concat(this.engine.fuelType));
    };
    return Car;
}());
// Example usage
var myEngine = new Engine(250, 'Petrol');
var myCar = new Car('Toyota', 'Camry', 2022, myEngine);
myCar.start();
myCar.printCarDetails();
