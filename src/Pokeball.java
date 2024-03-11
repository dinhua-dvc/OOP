public class Pokeball extends Charmander {

    public Charmander charmander;
    public boolean Hascharmanderinside;


    public Pokeball(Charmander charmander){
        this.charmander = charmander;
    }
    public Charmander Open(){
        return this.charmander;
    }
    public void Close(Charmander charmander){
        this.charmander = charmander;
    }
    public boolean GetCharmanderInside(){
        return this.charmander;
    }

}