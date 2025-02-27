// Define a class called 'Bus' with properties and a method
class Bus {
    make: string;
    model: string;
    year: number;

    // Constructor to initialize the properties when a Bus object is created
    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to start the bus
    start(): void {
        console.log(`The ${this.year} ${this.make} ${this.model} bus is starting...`);
    }
}

// Create an instance of the 'Bus' class
const objBus = new Bus('TATA', 'Starbus Ultra', 2022);

// Call the 'start' method to indicate the bus is starting
objBus.start();
