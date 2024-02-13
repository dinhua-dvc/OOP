public class Pokeball {
    private String name;
    private Pokemon pokemon;

    public Pokeball(String name, Pokemon pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public String getName() {
        return name;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
