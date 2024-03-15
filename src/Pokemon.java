abstract class Pokemon {

    public String name;

    public Pokemon(String name) {
        this.setName(name);
    }

    public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    }

    abstract Powers getType();

    abstract Powers getStrength();

    abstract Powers getWeakness();
}
2