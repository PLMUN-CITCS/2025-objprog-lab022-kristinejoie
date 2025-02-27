// Car class definition
class Car {
    // Attributes (Instance Variables)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class
public class CarDemo {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();

        // Assigning values to the Car object's attributes
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Calling the displayInfo method to show car details
        myCar.displayInfo();
    }
}