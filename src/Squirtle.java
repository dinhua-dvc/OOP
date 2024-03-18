class Squirtle extends Pokemon {

    public Squirtle(String name) {
        super(name);
    }

    @Override
    Powers getType() {
        return Powers.WATER;
    }

    @Override
    Powers getWeakness() {
        return Powers.GRASS;
    }

}