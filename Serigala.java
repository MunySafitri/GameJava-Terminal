public class Serigala extends Musuh{ 
    private int power = 500;
    private int damage = 250;

    Serigala(){
        setDamage(this.damage);
        setPower(this.power); 
    }
    @Override
    public void mati(){
        System.out.println("Serigala sudah mati");
    }

}