interface Shape {
    double getArea();
    double getPerimeter();
    void fillColor(String color);
    String getColor();
    void displayProperties();
}

class Circle implements Shape {
    double radius;
    String color;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void fillColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void displayProperties() {
        System.out.println("Circle -> Radius: " + radius + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", Color: " + getColor());
    }
}

class Rectangle implements Shape {
    double length, width;
    String color;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void fillColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void displayProperties() {
        System.out.println("Rectangle -> Length: " + length + ", Width: " + width + ", Area: " + getArea() + ", Perimeter: " + getPerimeter() + ", Color: " + getColor());
    }
}


class PaintBoard {
    double width, height;
    Shape[] shapes;
    int count;

    PaintBoard(double width, double height, int capacity) {
        this.width = width;
        this.height = height;
        this.shapes = new Shape[capacity]; // Fixed-size array
        this.count = 0;
    }

    void addShape(Shape shape) {
        if (count < shapes.length) {
            shapes[count++] = shape;
        } else {
            System.out.println("PaintBoard is full, cannot add more shapes.");
        }
    }

    void displayShapes() {
        for (int i = 0; i < count; i++) {
            shapes[i].displayProperties();
        }
    }
}

public class Q1_4 {
    public static void main(String[] args) {
        PaintBoard board = new PaintBoard(500, 500, 5);

        Circle circle1 = new Circle(5);
        circle1.fillColor("Red");
        board.addShape(circle1);

        Rectangle rectangle1 = new Rectangle(10, 20);
        rectangle1.fillColor("Blue");
        board.addShape(rectangle1);

        Circle circle2 = new Circle(8);
        circle2.fillColor("Green");
        board.addShape(circle2);

        board.displayShapes();
    }
}

