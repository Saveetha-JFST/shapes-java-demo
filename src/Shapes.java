import java.util.Scanner;

abstract class Shape
{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Rectangle extends Shape {
    private final double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this. breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {
    private final double base, height, leftSide, rightSide;

    public Triangle(double base, double height, double leftSide, double rightSide) {
        this.base = base;
        this.height = height;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

    public double calculatePerimeter() {
        return leftSide + rightSide + base;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}


class Shapes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 - Rectangle");
            System.out.println("2 - Triangle");
            System.out.println("3 - Circle");
            System.out.println("4 - Exit");
            System.out.println("Enter the choice of the shape... ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter the length of the rectangle");
                    double length = scanner.nextDouble();

                    System.out.println("Enter the breadth of the rectangle");
                    double breadth = scanner.nextDouble();

                    Shape rectangle = new Rectangle(length, breadth);

                    System.out.println("Area of the rectangle : " + rectangle.calculateArea() + " sq. units");
                    System.out.println("Perimeter of the rectangle : " + rectangle.calculatePerimeter() + " units");
                    break;

                case 2:
                    System.out.println("Enter the base of the triangle");
                    double base = scanner.nextDouble();

                    System.out.println("Enter the height of the triangle");
                    double height = scanner.nextDouble();

                    System.out.println("Enter the left side of the triangle");
                    double leftSide = scanner.nextDouble();

                    System.out.println("Enter the right side of the triangle");
                    double rightSide = scanner.nextDouble();

                    Shape triangle = new Triangle(base, height, leftSide, rightSide);

                    System.out.println("Area of the rectangle : " + triangle.calculateArea() + " sq. units");
                    System.out.println("Perimeter of the rectangle : " + triangle.calculatePerimeter() + " units");
                    break;

                case 3:
                    System.out.println("Enter the radius of the circle");
                    double radius = scanner.nextDouble();

                    Shape circle = new Circle(radius);

                    System.out.println("Area of the rectangle : " + circle.calculateArea() + " sq. units");
                    System.out.println("Perimeter of the rectangle : " + circle.calculatePerimeter() + " units");
                    break;
            }
        }while(choice != 4);
    }
}



