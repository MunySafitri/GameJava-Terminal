public class Ular extends Musuh{ 

    private int power = 250;
    private int damage = 100;

    Ular(){
        setDamage(this.damage);
        setPower(this.power); 
    }
    @Override
    public void mati(){
        System.out.println("Ular sudah mati");
    }

}