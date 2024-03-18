class Bulbasaur extends Pokemon {

    public Bulbasaur(String name) {
        super(name);
    }

    @Override
    Powers getType() {
        return Powers.GRASS;
    }

    @Override
    Powers getWeakness() {
        return Powers.FIRE;
    }

}