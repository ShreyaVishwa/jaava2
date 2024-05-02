import java.util.Scanner;

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "color: " + color + ", filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}

public class Bee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        // Check if the input sides form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            System.out.print("Enter the color of the triangle: ");
            String color = scanner.next();

            System.out.print("Is the triangle filled (true/false): ");
            boolean filled = scanner.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            
            System.out.println("Triangle Properties:");
            System.out.println(" - Side 1: " + triangle.getSide1());
            System.out.println(" - Side 2: " + triangle.getSide2());
            System.out.println(" - Side 3: " + triangle.getSide3());
            System.out.println(" - Area: " + triangle.getArea());
            System.out.println(" - Perimeter: " + triangle.getPerimeter());
            System.out.println(" - Color: " + triangle.getColor());
            System.out.println(" - Filled: " + triangle.isFilled());
        } else {
            System.out.println("The input sides do not form a valid triangle.");
        }
        scanner.close();
       
    }

    // Method to check if the input sides form a valid triangle
    private static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}
