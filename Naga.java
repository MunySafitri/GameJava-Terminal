public class Naga extends Musuh{ 
    private int power = 1000;
    private int damage = 400;

    Naga(){
        setDamage(this.damage);
        setPower(this.power);   
    }
    public void mati(){
        System.out.println("Naga sudah mati");
    }

}