class Book {
    // Attributes
    private int code;
    private String title;
    private double unitPrice;
    private double discountRate;

    // Parameterized constructor
    public Book(int code, String title, double unitPrice, double discountRate) {
        this.code = code;
        this.title = title;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
    }

    // Method to calculate discounted price
    public double calculateDiscountedPrice() {
        return unitPrice * (1 - discountRate);
    }

    // Method to display book information with discounted price
    public void displayBookInfo() {
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("Discounted Price: " + calculateDiscountedPrice());
    }
}

public class Bookshop {
    // Main method
    public static void main(String[] args) {
        // Create two novels with their details
        Book novel1 = new Book(101, "The Great Gatsby", 15.99, 0.1); // 10% discount
        Book novel2 = new Book(102, "To Kill a Mockingbird", 12.49, 0.15); // 15% discount

        // Display information for each novel
        System.out.println("Novel 1:");
        novel1.displayBookInfo();

        System.out.println("\nNovel 2:");
        novel2.displayBookInfo();
    }
}
