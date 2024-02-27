import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose an animal: [dog, cat or fish]");
            String chosenAnimal = scanner.nextLine().toLowerCase();
            
            if (chosenAnimal.equals("dog")) {
                System.out.println("            ,\n            |`-.__\n            / \' _/\n           ****` \n          /    }\n         /  \\ /\n     \\ /`   \\\\\\\njgs   `\\    /_\\\\\n       `~~~~~``~`");
                break;
            } else if (chosenAnimal.equals("cat")) {
                System.out.println("   |\\---/|\n   | ,_, |\n    \\_`_/-..----.\n ___/ `   \' ,\"\"+ \\  sk\n(__...\'   __\\    |`.___.\';\n  (_,...\'(_,.`__)/\'.....+");
                break;
            } else {
                System.out.println("Invalid choice. Please choose either 'dog' or 'cat'");
            }
        }
        scanner.close();
    }
}
