
public class Trainer {
    public String name;
    public  List<Pokeball> belt;

    public String(string name){
        this.name = name;
        this.belt = new List<Pokeball> belt;
    }
    public void TakePokeball(Pokeball pokeball){
            /// add an if when the pokeballs become 6
        belt Add(pokeball);
    }

    public Charmander throwPokeball(){
        /// get a pokeball from the belt
        Pokeball pokeball = belt[index];

        /// the pokeball opens and charmander does his battlecry
        Charmander charmander = pokeball.Open();

        return charmander;
    }

    public void ReturnPokemon(Charmander charmander){
        Pokeball pokeball = belt[index];

        pokeball.Close(charmander);
    }
}

