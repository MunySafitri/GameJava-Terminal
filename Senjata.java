public class Senjata{ 
    private int damage;
    private int peluru;

    Senjata(){
        this.damage = 350;
        this.peluru = 3;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    public int getPeluru(){
        return this.peluru;
    }
    public int getDamage(){
        return this.damage;
    }

}