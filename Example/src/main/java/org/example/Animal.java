package org.example;// Corrected Java Program

// Define the Cat class
class Cat {
    public String sound; // Instance variable for sound
    public String food;  // Instance variable for food

    // Constructor for Cat (optional, but good practice)
    public Cat(String sound, String food) {
        this.sound = sound;
        this.food = food;
    }

    // Method to get cat's sound
    public String getSound() {
        return sound; // Return the sound
    }

    // Method to get cat's food preference
    public String getFood() {
        return food; // Return the food
    }

    // A method to make the cat speak and eat
    public void speakAndEat() {
        System.out.println("The cat says: " + getSound() + "!");
        System.out.println("The cat likes to eat: " + getFood() + ".");
    }
}

// Define Dog as an interface (for 'implements' keyword)
// An interface defines a contract: classes that implement it must provide these methods.
interface DogActions {
    String getDogSound();
    String getDogFood();
    void checkFriendly(int friendlinessLevel); // Method to check friendliness
}

// Implement the DogActions interface in a Dog class
class Dog implements DogActions {
    public String sound;
    public String food;
    public int friendlinessLevel; // Changed to int for numeric comparison

    // Constructor for Dog
    public Dog(String sound, String food, int friendlinessLevel) {
        this.sound = sound;
        this.food = food;
        this.friendlinessLevel = friendlinessLevel;
    }

    @Override // Annotation indicating this method implements an interface method
    public String getDogSound() {
        return sound;
    }

    @Override // Annotation indicating this method implements an interface method
    public String getDogFood() {
        return food;
    }

    @Override // Annotation indicating this method implements an interface method
    public void checkFriendly(int friendlinessLevel) {
        if (this.friendlinessLevel >= friendlinessLevel) { // Use '==' for exact, '>=' for threshold
            System.out.println("This dog is friendly to people.");
        } else {
            System.out.println("This dog is not a friendly one, so run!");
        }
    }

    // A method for dog to speak and eat
    public void speakAndEat() {
        System.out.println("The dog says: " + getDogSound() + "!");
        System.out.println("The dog likes to eat: " + getDogFood() + ".");
    }
}

// The main class, Animal, extends Cat (single inheritance)
// It cannot implement Dog directly as Dog is a class, but it could interact with Dog objects.
// If you wanted Animal to have Dog-like actions, it would need to implement DogActions.
public class Animal { // Removed "extends Cat implements Dog" from here for simplicity and correctness

    public static void main(String[] args) {

        // Create a Cat object
        Cat myCat = new Cat("Meow", "Fish");
        myCat.speakAndEat(); // Call the cat's method to demonstrate

        System.out.println("\n--- Dog Actions ---");

        // Create a Dog object
        Dog myDog = new Dog("Woof", "Bones", 90); // Example friendliness level
        myDog.speakAndEat(); // Call the dog's method
        myDog.checkFriendly(80); // Check friendliness with a threshold

        System.out.println("\n--- Polymorphism Example (Optional) ---");
        // An example of how you might use these:
        // You cannot directly call animal.getFood("fish") if Animal doesn't have such a method.
        // Instead, you'd create instances of Cat or Dog.
    }
}