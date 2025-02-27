
class Bus {
    make: string;
    model: string;
    year: number;

    // Constructor to initialize the properties when an object is created
    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display bus details
    displayInfo(): void {
        console.log(`Bus Make: ${this.make}`);
        console.log(`Bus Model: ${this.model}`);
        console.log(`Manufacturing Year: ${this.year}`);
    }
}

const objBus = new Bus('TATA', 'Starbus Ultra', 2022);

objBus.displayInfo();
