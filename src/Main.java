import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("What would you like to name your charmander?");
        String name = userInput.nextLine(); // The player answers with the desired namehe
        Pokemon charmander = new Charmander(name); // charmander is initialized through the Charmander subclass
=======
        System.out.println("What would you like to name the challenger?");
        String name = userInput.nextLine(); // The player answers with the desired name
        String challengerName = userInput.nextLine();
        Trainer challenger = new Trainer(challengerName);
        System.out.println("What would you like to name the opponent?");
        String opponentName = userInput.nextLine();
        Trainer opponent = new Trainer(opponentName);
>>>>>>> 6bccf392d35b255b22292e800eb145ef158df255
        boolean gameplay = true;
        while (gameplay) { // Input loop for the game
            for (int i = 0; i < 6; i++) { 
             challenger.takePokeball(new Pokeball(new Charmander("Charmander" + i, "Fire", "Water")));
             System.out.println(challenger + "pakt zijn pokeball");
             challenger.throwPokeball(i).battleCry();
             opponent.takePokeball(new Pokeball(new Charmander("Charmander" + i, "Fire", "Water")));
             System.out.println(opponent + "pakt zijn pokeball");
             opponent.throwPokeball(i).battleCry();
             challenger.returnPokemon(null, i);
             opponent.returnPokemon(null, i);
            }
            System.out.println("do you want to stop? (type 'STOP' to stop the game)");
            name = userInput.nextLine();
            if (Objects.equals(name.toLowerCase(), "stop")) { // stops the loop if the input given is "stop"
                gameplay = false;
            } else {
                
            }
        }
        System.out.println("Thanks for playing!");
    }
}