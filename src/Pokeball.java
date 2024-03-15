class Pokeball {
    public Charmander charmander;
    public boolean hasCharmanderInside;

    public Pokeball(Charmander charmander) {
        this.charmander = charmander;
    }

    public Charmander open() {
        return this.charmander;
    }

    public void close(Charmander charmander) {
        this.charmander = charmander;
    }

    public Charmander getCharmanderInside() {
        return this.charmander;
    }
}
 