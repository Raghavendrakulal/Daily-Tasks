// I have taken vehicle example for inheritance
// vehicle is main class and Bike and car are inherited from the vehicle class to inherit them we use extend keyword.
//super key word will be used to call parent class method


class Vehicle {
    private String brand;
    private int speed;

    
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    
    public String getBrand() {
        return brand;
    }

   
    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public int getSpeed() {
        return speed;
    }

    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Child class 
class Car extends Vehicle {
    private int numberOfDoors;

    
    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed); // Call to the parent class constructor
        this.numberOfDoors = numberOfDoors;
    }

   //getter
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Setter 
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Child class 
class Bike extends Vehicle {
    private boolean hasCarrier;

    // Constructor
    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed); // Call to the parent class constructor
        this.hasCarrier = hasCarrier;
    }

    // Getter 
    public boolean isHasCarrier() {
        return hasCarrier;
    }

    // Setter 
    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    // Overriding
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car("Toyota", 180, 4);
        System.out.println("Car Details:");
        car.displayDetails();

        // Creating a Bike object
        Bike bike = new Bike("Yamaha", 120, true);
        System.out.println("\nBike Details:");
        bike.displayDetails();
    }
}
