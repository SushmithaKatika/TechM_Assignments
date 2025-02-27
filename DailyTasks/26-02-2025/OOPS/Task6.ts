class Student {
    name: string;
    rollNumber: number | null;

    constructor(name: string, rollNumber?: number) {
        this.name = name;
        this.rollNumber = rollNumber ?? null;
    }
}

// Example usage
const student1 = new Student("Sushmitha", 21);
const student2 = new Student("Srujana");

console.log(student1); 
console.log(student2);