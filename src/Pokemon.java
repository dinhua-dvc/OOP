public class Pokemon {
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrength() {
        return this.strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getWeakness() {
        return this.weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }
}
