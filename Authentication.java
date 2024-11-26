//By using HashMap we can do signup signin and signout
//Signup
//First we need tocreate a hashmap and during signup we need to push to hashmap if not present usernam ein map
//signin
//check for username and pass word in hashmap and verify
//signout
//remove user name

// Using switch case we can inplement all three operations 

import java.util.HashMap;
import java.util.Scanner;

public class Authentication {

    // HashMap to store user credentials (username, password)
    private static HashMap<String, String> userDatabase = new HashMap<>();
    private static String loggedInUser = null;

    // Signup
    public static void signUp(Scanner scanner) {
        System.out.println(" Sign-Up");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists! Please try again.");
        } else {
            userDatabase.put(username, password);
            System.out.println("Sign-Up successful! You can now log in.");
        }
    }

    // signin
    public static void signIn(Scanner scanner) {
        System.out.println("Sign-In");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            loggedInUser = username;
            System.out.println("Sign-In successful! Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    // Method for signing out
    public static void signOut() {
        if (loggedInUser != null) {
            System.out.println("Sign-Out successful! Goodbye, " + loggedInUser + ".");
            loggedInUser = null;
        } else {
            System.out.println("You are not signed in.");
        }
    }

    // Main method for menu-driven command-line interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n---- User Authentication System ----");
            System.out.println("1. Sign-Up");
            System.out.println("2. Sign-In");
            System.out.println("3. Sign-Out");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    signUp(scanner);
                    break;
                case 2:
                    signIn(scanner);
                    break;
                case 3:
                    signOut();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
