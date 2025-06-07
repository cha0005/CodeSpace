// Define the Product interface
interface Product {
    float tax_rate = 0.05f; // Tax rate attribute
}

// Implement the ElectronicProduct class that uses the Product interface
class ElectronicProduct implements Product {
    float unit_price;      // Unit price of the product
    int quantity_ordered;  // Quantity ordered of the product
    float tax_amount;      // Tax amount for the product
    float final_amount;    // Final amount with tax

    // Constructor to initialize the attributes
    ElectronicProduct(float unit_price, int quantity_ordered) {
        this.unit_price = unit_price;
        this.quantity_ordered = quantity_ordered;
    }

    // Method to calculate the tax amount
    void calculateTax() {
        tax_amount = unit_price * quantity_ordered * tax_rate;
    }

    // Method to calculate the final amount (with tax)
    void calculateFinalAmount() {
        final_amount = (unit_price * quantity_ordered) + tax_amount;
    }

    // Method to display the final amount
    void displayFinalAmount() {
        System.out.println("Final amount (with tax): " + final_amount);
    }

    // Method to input and set data
    void setData(float unit_price, int quantity_ordered) {
        this.unit_price = unit_price;
        this.quantity_ordered = quantity_ordered;
    }

    public static void main(String[] args) {
        // Example usage
        ElectronicProduct product = new ElectronicProduct(100.0f, 5); // Create an instance with unit price and quantity ordered
        product.calculateTax();       // Calculate tax amount
        product.calculateFinalAmount(); // Calculate final amount with tax
        product.displayFinalAmount(); // Display final amount
    }
}
