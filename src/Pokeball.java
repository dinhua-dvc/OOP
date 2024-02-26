public class Pokeball {

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
