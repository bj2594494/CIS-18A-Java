package bdj;

public class character_stat extends game_character{
    private int hp;
    private int mp;
    private int sp;
    private int str;
    private int dex;
    private int inte;
    private int lck;
    
    public character_stat(String name, int level,int hp,int mp,int sp,int str, int dex, int inte, int lck){
        super(name, level);
        this.hp=hp;
        this.mp=mp;
        this.sp=sp;
        this.str=str;
        this.dex=dex;
        this.inte=inte;
        this.lck=lck;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        hp=level*500;
        this.hp = hp;
    }

    /**
     * @return the mp
     */
    public int getMp() {
        return mp;
    }

    /**
     * @param mp the mp to set
     */
    public void setMp(int mp) {
        mp=level*200;
        this.mp = mp;
    }

    /**
     * @return the sp
     */
    public int getSp() {
        return sp;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(int sp) {
        sp=level*50;
        this.sp = sp;
    }

    /**
     * @return the str
     */
    public int getStr() {
        return str;
    }

    /**
     * @param str the str to set
     */
    public void setStr(int str) {
        this.str = str;
    }

    /**
     * @return the dex
     */
    public int getDex() {
        return dex;
    }

    /**
     * @param dex the dex to set
     */
    public void setDex(int dex) {
        this.dex = dex;
    }

    /**
     * @return the inte
     */
    public int getInte() {
        return inte;
    }

    /**
     * @param inte the inte to set
     */
    public void setInte(int inte) {
        this.inte = inte;
    }

    /**
     * @return the lck
     */
    public int getLck() {
        return lck;
    }

    /**
     * @param lck the lck to set
     */
    public void setLck(int lck) {
        this.lck = lck;
    }
    
    
}
