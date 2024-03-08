public class Pokeball {
<<<<<<< HEAD
    public String empty;

    public String charmander;

    public Integer amount;


    public pokeball(String Empty, String Charmaner, Integer Amount) {
        this.empty = Empty;
        this.charmander = Charmander;
        this.amount = Amount;
    }

}
=======

    private Charmander charmander;

    public Pokeball() {
        this.charmander = null;
    }

    public void PokeballEmpty() {
        return charmander == null;
    }

    public void throwPokeball() {

    }

    public void returnCharmander() {
    }

    public Charmander getCharmander() {
        return charmander;
    }

    public void setCharmander(Charmander charmander) {
        this.charmander = charmander;
    }
}
>>>>>>> 4c96c56fada235d12b3ff0f45db4401b0c27e93c
