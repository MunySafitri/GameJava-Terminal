import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class App {

    static char[][] lokasi = new char[10][20];
    static int tempat = 1;
    static Pemain player = new Pemain("Muny");

    public static void main(String[] args) throws Exception {
        
        
        App game = new App();
        Musuh musuh = new Gorila();
        System.out.println(musuh.getPower());
        Musuh musuh2 = new Ular();
        System.out.println(musuh2.getPower());
        Musuh musuh3 = new Naga();
        System.out.println(musuh3.getPower());
        Musuh musuh4 = new Serigala();
        System.out.println(musuh4.getPower());
        
        Senjata pistol = new Senjata();
        System.out.println(pistol.getPeluru());
        Pisau pisau = new Pisau();
        System.out.println(pisau.getPisau());
        player.menendang(musuh3);

        System.out.println(musuh3.getPower());

        buatLokasi();
        
        
        Scanner inp = new Scanner(System.in);
        String pil;
        lokasi[player.getX()][player.getY()] = 'O';
        validasi(); 

        //BERGERAK
        do{  
            System.out.print("pilihan: ");
            pil = inp.nextLine();
            clearScreen();     
            tempat = player.berjalan(game, pil,tempat); 
            //iflokasi1 if lokasi2 if lokasi3
        }while(true);

        
    }

    public static void buatLokasi(){
        if(tempat == 1){
            Lokasi1 satu = new Lokasi1();
            lokasi = satu.buatLokasi();
            System.out.println("lokasi 1");
        }if(tempat == 2){
            Lokasi2 dua = new Lokasi2();
            lokasi = dua.buatLokasi();
            
            System.out.println("lokasi 2");
        }
        System.out.println(tempat);
    }

    public static void validasi(){
        System.out.println("|==========================================|");
        for(int i = 0 ; i < lokasi.length; i++){
            System.out.print("||");
            for(int j = 0; j < lokasi[i].length; j++){
                System.out.print(lokasi[i][j]+" ");
            }
            System.out.println("||");
        }
        System.out.println("|==========================================|");
    }

    static void clearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch (Exception e){
            System.err.println("Tidak bisa clear screen");
        }
    }
}
