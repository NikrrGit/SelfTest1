import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: "); // Fist name 
        String firstName = scanner.nextLine();

        System.out.println("Enter your last name: ");   // Last name 
        String lastName = scanner.nextLine();

        String pigLatinFirstName = pigLatinize(firstName);
        String pigLatinLastName = pigLatinize(lastName);

        System.out.printf("Your name in Pig Latin is: %s %s%n", pigLatinFirstName, pigLatinLastName);
    }

    public static String pigLatinize(String word) {
        if (word.isEmpty()) {
            return word;
        }

        String firstLetter = word.substring(0,1).toUpperCase();
        String restOfWord = word.substring(1).toLowerCase();
        return restOfWord + firstLetter + "ay";
    }
}