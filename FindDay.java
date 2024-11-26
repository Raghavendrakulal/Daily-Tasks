// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.util.Scanner;

// public class FindDay{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter date YYYY-MM-DD");
//         String input=sc.nextLine();
//         try{
//         DateTimeFormatter formatter= DateTimeFormatter.ofPattern("YYYY-MM-DD");
//         LocalDate date=LocalDate.parse(input,formatter);
//         String day=date.getDayOfWeek().toString();
//         System.out.println("DAy will be"+ day);
//          } catch (Exception e) {
//             System.out.println("Invalid date format! Please use yyyy-MM-dd.");
//         }
//         sc.close();
        
//     }
// }
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FindDay {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for a date in the format yyyy-MM-dd
        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        try {
            // Define the date format to match user input
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            
            // Parse the input string to LocalDate
            LocalDate date = LocalDate.parse(inputDate, formatter);
            
            // Get the day of the week for the date
            String dayOfWeek = date.getDayOfWeek().toString();
            
            // Output the result
            System.out.println("The day of the week is: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date format! Please use yyyy-MM-dd.");
        }

        // Close the scanner
        scanner.close();
    }
}
