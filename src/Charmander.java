public class Charmander extends Pokemon {
    public Charmander(String name) {
        super(name);
    }

    @Override
    Powers getType() {
        return Powers.FIRE;
    }

    @Override
    Powers getStrength() {
        return Powers.FIRE;
    }

    @Override
    Powers getWeakness() {
        return Powers.WATER;
    }
}
