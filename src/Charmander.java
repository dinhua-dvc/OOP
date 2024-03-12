public class Charmander {
    public String nickname;
    public String strength;
    public String weakness;

    public Charmander(String nickname,String strength,String weakness){
        this.nickname = nickname;
        this.strength = strength;
        this.weakness = weakness;
    }
    public Charmander(String name) {
        //TODO Auto-generated constructor stub
    }
    public void battleCry(){
        System.out.println("charmander");
    }
}
