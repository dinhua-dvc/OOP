public class Pokeball {

    private Charmander charmander;

    public Pokeball() {
        this.charmander = null;
    }

    // Method to check if the Pokeball is empty
    public boolean isPokeballEmpty() {
        return charmander == null;
    }

    // Method to throw the Pokeball and release the Charmander
    public void throwPokeball() {
        if (!isPokeballEmpty()) {
            System.out.println("Throwing the Pokeball!");
            System.out.println("Charmander " + charmander.getName() + " has been released!");
            charmander = null; // Charmander is released, so the Pokeball becomes empty
        } else {
            System.out.println("The Pokeball is empty. Cannot throw.");
        }
    }

    // Method to return the Charmander back to its Pokeball
    public void returnCharmander(Charmander charmander) {
        if (isPokeballEmpty()) {
            System.out.println("Returning Charmander " + charmander.getName() + " to its Pokeball.");
            this.charmander = charmander; // Charmander is returned to the Pokeball
        } else {
            System.out.println("The Pokeball already contains a Charmander.");
        }
    }

    // Getter method to retrieve the Charmander inside the Pokeball
    public Charmander getCharmander() {
        return charmander;
    }

    // Setter method to set the Charmander inside the Pokeball
    public void setCharmander(Charmander charmander) {
        this.charmander = charmander;
    }
}
