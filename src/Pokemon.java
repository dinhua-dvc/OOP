abstract class Pokemon {

    public String name;
    public String strength;
    public String weakness;
    public String type;

    public Pokemon(String name, String type, String strength, String weakness) {
        this.setName(name);
        this.setType(type);
        this.setStrength(strength);
        this.setWeakness(weakness);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract Powers getType();

    abstract Powers getStrength();

    abstract Powers getWeakness();
}
