
//Compile time poly

class Calculator {
    // 2 int
    public int add(int a, int b) {
        return a + b;
    }

    // 3 int
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //2 double
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphismExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 10.5));
    }
}


//Run time poly 
// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (Dog)
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class (Cat)
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal; 

        // Create a Dog object
        myAnimal = new Dog();
        myAnimal.sound(); // Calls Dog's sound() method

        // Create a Cat object
        myAnimal = new Cat();
        myAnimal.sound(); // Calls Cat's sound() method
    }
}



