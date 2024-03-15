import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
 
        Trainer trainer1 = new Trainer("Ash");
        Trainer trainer2 = new Trainer("Misty");
 
        for (int i = 0; i < 6; i++) {
            trainer1.takePokeball(new Pokeball(new Charmander("Charmander" + i, "Fire", "Water")));
            trainer2.takePokeball(new Pokeball(new Charmander("Charmander" + i, "Fire", "Water")));
        }
 
        for (int i = 0; i < 6; i++) {
            trainer1.throwPokeball(i).battleCry();
            trainer2.throwPokeball(i).battleCry();
        }
    }
}