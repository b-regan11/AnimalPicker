import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an animal: [dog or cat]");
            String chosenAnimal = scanner.nextLine().toLowerCase();
            
            if (chosenAnimal.equals("dog")) {
                System.out.println("DOG ASCII ART HERE");
                break;
            } else if (chosenAnimal.equals("cat")) {
                System.out.println("CAT ASCII ART HERE");
                break;
            } else {
                System.out.println("Invalid choice. Please choose either 'dog' or 'cat'");
                //System.exit(0);
            }
        }
        scanner.close();
    }
}
