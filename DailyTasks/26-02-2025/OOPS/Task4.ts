class Engine {
    horsepower: number;
    fuelType: string;
  
    constructor(horsepower: number, fuelType: string) {
      this.horsepower = horsepower;
      this.fuelType = fuelType;
    }
  }
  
  class Car {
    make: string;
    model: string;
    year: number;
    engine: Engine;
  
    constructor(make: string, model: string, year: number, engine: Engine) {
      this.make = make;
      this.model = model;
      this.year = year;
      this.engine = engine;
    }
  
    start() {
      console.log(`${this.make} ${this.model} is starting...`);
    }
  
    printCarDetails() {
      console.log(`Car: ${this.make} ${this.model} (${this.year})`);
      console.log(`Engine: ${this.engine.horsepower} HP, Fuel Type: ${this.engine.fuelType}`);
    }
  }
  
  // Example usage
  const myEngine = new Engine(250, 'Petrol');
  const myCar = new Car('Toyota', 'Camry', 2022, myEngine);
  myCar.start();
  myCar.printCarDetails();
  