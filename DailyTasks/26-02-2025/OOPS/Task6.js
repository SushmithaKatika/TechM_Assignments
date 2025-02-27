var Student = /** @class */ (function () {
    function Student(name, rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber !== null && rollNumber !== void 0 ? rollNumber : null;
    }
    return Student;
}());
// Example usage
var student1 = new Student("Sushmitha", 21);
var student2 = new Student("Srujana");
console.log(student1);
console.log(student2);
