import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        System.out.println("Choose an animal: [dog or cat]");

        Scanner scanner = new Scanner(System.in);
        String chosenAnimal = scanner.nextLine().toLowerCase();
        
        if (chosenAnimal.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (chosenAnimal.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        } else {
            System.out.println("Invalid choice. Please choose either 'dog' or 'cat'");
            System.exit(0);
        }

        scanner.close();
    }
}
