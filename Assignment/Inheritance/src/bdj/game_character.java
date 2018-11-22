package bdj;

public class game_character {
    protected String name;
    protected int level;
    
    public game_character(String name, int level){
        this.name=name;
        this.level=level;
    }
    
    @Override
    public String toString(){
        return("Character name: "+name+"\n"+"Character level: "+level);
    }
}


