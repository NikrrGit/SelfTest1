import java.util.Scanner;

public class RolePlaying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the name of your character: "); // Character name
        String name = scanner.nextLine();

       // Get character stats
        int strength = getValidInput(scanner, "Enter strength (1-10): ");    
        int intelligence = getValidInput(scanner, "Enter intelligence (1-10): ");
        int luck = getValidInput(scanner, "Enter luck (1-10): ");

        
        int totalPoints = strength + intelligence + luck;   // total points

        if (totalPoints > 15) {
            System.out.println("\nTotal points exceed 15. Resetting all characteristics to 5.");
            strength = 5;
            intelligence = 5;
            luck = 5;
        }

        // Print character details
        System.out.println("\nCharacter created:");
        System.out.println("Name: " + name);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Luck: " + luck);
        System.out.println("Total points: " + (strength + intelligence + luck));

        scanner.close();
    }

    public static int getValidInput(Scanner scanner, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= 1 && value <= 10) {
                    scanner.nextLine(); // Clear the buffer
                    return value;
                } else {
                    System.out.println("Please enter a value between 1 and 10.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}