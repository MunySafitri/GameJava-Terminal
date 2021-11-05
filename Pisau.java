public class Pisau{ 
    private int damage;
    private int pisau;

    Pisau(){
        this.damage = 250;
        this.pisau = 3;
    }
    
    public void setPisau(int pisau){
        this.pisau = pisau;
    }
    public int getPisau(){
        return this.pisau;
    }
    public int getDamage(){
        return this.damage;
    }    

}