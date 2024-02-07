import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to name your charmander?");
        String name = userInput.nextLine(); // The player answers with the desired name
        Pokemon charmander = new Charmander(name, "Fire", "Fire", "Water"); // charmander is initialized through the Charmander subclass
        boolean gameplay = true;
        while (gameplay) { // Input loop for battle cry and renaming
            for (int loop = 0; loop < 10; loop++) { // Repeats the battlecry 10 times
                System.out.println(charmander.getName() + "!!!");
            }
            System.out.println("What would you like to rename your charmander to? (type 'STOP' to stop the game)");
            name = userInput.nextLine();
            if (Objects.equals(name.toLowerCase(), "stop")) { // stops the loop if the input given is "stop"
                gameplay = false;
            } else {
                charmander.setName(name); // Renames the charmander
            }
        }
        System.out.println("Thanks for playing! " + charmander.getName() + " will miss you. Goodbye!");
    }
}