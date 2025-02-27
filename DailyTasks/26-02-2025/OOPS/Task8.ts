class Student {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age > 0 ? age : 0; 
    }

    displayInfo() {
        console.log(`Name: ${this.name}, Age: ${this.age}`);
    }
}

// Example usage
const student1 = new Student('Sushmitha', 21);
student1.displayInfo(); 

const student2 = new Student('Srujana', 22);
student2.displayInfo(); 
