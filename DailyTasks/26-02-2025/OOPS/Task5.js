var Student = /** @class */ (function () {
    function Student(name, studentClass) {
        this.name = name;
        this.class = studentClass;
    }
    return Student;
}());
// Example usage:
var student1 = new Student('Sushmitha', 'btech');
console.log("Name: ".concat(student1.name, ", Class: ").concat(student1.class));
