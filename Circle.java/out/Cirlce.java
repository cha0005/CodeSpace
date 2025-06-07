import java.util.Scanner;

public class Cirlce {

    // Attribute
    private float radius;

    // Constructor
    public void Circle(float radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User inputs
        System.out.println("Enter the radius: ");
        float radius = input.nextFloat();

        // Create Circle object
        Circle circle = new Circle(radius);

        // Output circle area
        System.out.println("Circle area = " + circle.getArea());
    }
}

