import java.util.Scanner;

class Shapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle");
        double breadth = scanner.nextDouble();


        Rectangle rectangle = new Rectangle(length, breadth);

        System.out.println("Area of the rectangle : " + rectangle.calculateArea() + " sq. units");
        System.out.println("Perimeter of the rectangle : " + rectangle.calculatePerimeter() + " units");
    }
}

class Rectangle {
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


