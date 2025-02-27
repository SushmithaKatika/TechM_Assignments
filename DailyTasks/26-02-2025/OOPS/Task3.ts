class Car{
    make: string;
    model: string;
    year: number;

    constructor(make:string,model:string,year:number){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    start(): void{
        console.log(`The ${this.year} ${this.make} ${this.model} car is starting`)
    }
}
class SUV extends Car{
    offRoadCapability: boolean;

    constructor(make:string, model:string, year:number, offRoadCapability: boolean){
        super(make, model, year);
        this.offRoadCapability=offRoadCapability;
    }
    toggleoffRoadCapability(): void  {
        this.offRoadCapability=!this.offRoadCapability;
        if(this.offRoadCapability){
            console.log(`${this.make} ${this.model} is now ready for off-road adventures`);
        }
        else{
            console.log(`${this.make} ${this.model} is now set to regular road mode`);
        }
    }
}

const mySUV = new SUV('Mahindra', 'Thar', 2024, false);

mySUV.start(); 
mySUV.toggleoffRoadCapability(); 
mySUV.toggleoffRoadCapability(); 