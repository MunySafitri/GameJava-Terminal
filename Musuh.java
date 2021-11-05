  class Musuh{
    private int power;
    private int damage;

    Musuh(){
        this.power = 0;
        this.damage = 0;
    }
    
    Musuh(int power, int damage){
        this.power = power;
        this.damage = damage;
    }

    public void melawan(Pemain player){
        player.setPower(player.getPower()-this.damage);
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public void mati(){
        System.out.println("Musuh sudah mati");
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }

}