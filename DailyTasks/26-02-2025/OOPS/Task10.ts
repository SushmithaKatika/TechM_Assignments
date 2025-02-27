class Person {
    name: string;
    age: number;
  
    constructor(name: string, age: number) {
      this.name = name;
      this.age = age;
    }
  }
  
  class Employee extends Person {
    employeeId: string;
  
    constructor(name: string, age: number, employeeId: string) {
      super(name, age);
      this.employeeId = employeeId;
    }
  }
  
  // Example usage
  const employee = new Employee('Sushmitha', 21, 'A21');
  console.log(employee);
  