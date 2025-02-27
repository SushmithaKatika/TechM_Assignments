var Student = /** @class */ (function () {
    function Student(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
    Student.prototype.displayInfo = function () {
        console.log("Name: ".concat(this.name, ", Age: ").concat(this.age));
    };
    return Student;
}());
// Example usage
var student1 = new Student('Sushmitha', 21);
student1.displayInfo();
var student2 = new Student('Srujana', 22);
student2.displayInfo();
