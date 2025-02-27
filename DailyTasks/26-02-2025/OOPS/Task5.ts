class Student {
    name: string;
    class: string;

    constructor(name: string, studentClass: string) {
        this.name = name;
        this.class = studentClass;
    }
}

// Example usage:
const student1 = new Student('Sushmitha', 'btech');
console.log(`Name: ${student1.name}, Class: ${student1.class}`);
