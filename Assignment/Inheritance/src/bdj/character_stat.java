package bdj;

public class character_stat extends game_character{
    private String stats;
    
    public character_stat(String name, int level){
        super(name, level);
        setStats();
    }

    /**
     * @return the stats
     */
    public String getStats() {
        return stats;
    }

    public void setStats() {
        int hp,mp,sp,str,dex,inte,lck;
        hp=level*100;
        mp=level*50;
        sp=level*20;
        str=5+level*4;
        dex=5+level*3;
        inte=5+level*2;
        lck=5+level;
        stats=(super.toString()+"\nCharacter Health Point: "+hp
                +"\nCharacter Mana Point: "+mp+"\nCharacter Stamina Point: "+sp
                +"\nCharacter Strength: "+str+"\nCharacter Dexterity Point: "+dex
                +"\nCharacter Intelligent Point: "+inte+"\nCharacter Luck Point: "+lck);
    }
    
}
