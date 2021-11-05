public class Gorila extends Musuh{ 
     private int power = 500;
     private int damage =250;

    Gorila(){
        setDamage(this.damage);
        setPower(this.power); 
    }
    @Override
    public void mati(){
        System.out.println("Gorila sudah mati");
    }

}