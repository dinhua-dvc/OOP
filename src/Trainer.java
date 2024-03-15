<<<<<<< HEAD
public class Trainer {
    private String name;


    public Trainer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
=======
import java.util.ArrayList;
import java.util.List;

class Trainer{
    public String name;
    public List<Pokeball> belt;
 
    public Trainer(String name) {
        this.name = name;
        this.belt = new ArrayList<>();
    }
 
    public void takePokeball(Pokeball pokeball) {
        if (belt.size() < 6) {
            belt.add(pokeball);
        }
    }
 
    public Charmander throwPokeball(int index) {
        if (index >= 0 && index < belt.size()) {
            Pokeball pokeball = belt.get(index);
            Charmander charmander = pokeball.open();
            return charmander;
        } else {
            return null;
        }
    }
 
    public void returnPokemon(Charmander charmander, int index) {
        if (index >= 0 && index < belt.size()) {
            Pokeball pokeball = belt.get(index);
            pokeball.close(charmander);
        }
    }
}
>>>>>>> 6bccf392d35b255b22292e800eb145ef158df255
