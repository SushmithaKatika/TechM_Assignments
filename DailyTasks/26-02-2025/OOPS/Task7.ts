class Shape {
    color: string;

    constructor(color: string) {
        this.color = color;
    }
}

class Circle extends Shape {
    radius: number;

    constructor(color: string, radius: number) {
        super(color);
        this.radius = radius;
    }
}

// Example usage
const circle = new Circle("red", 5);
console.log(`Circle Color: ${circle.color}, Radius: ${circle.radius}`);
