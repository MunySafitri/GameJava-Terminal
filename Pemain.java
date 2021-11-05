
public class Pemain{
        private String nama;
        private int nilai;
        private int power;
        private int damage;
        private int x , y;
        //String ni = 'O';
        App game;
        
       
        Pemain(String nama){
            this.nama = nama;
            this.nilai = 0;
            this.power = 1200;
            this.damage = 100;
            this.x = 9;
            this.y = 0;
            this.game.lokasi [x][y] = 'O';
        }

        public String getNama(){
            return this.nama;
        }

        public void setNama(String nama){
            this.nama = nama;
        }

        public int getNilai(){
            return this.nilai;
        }
        
        public void setNilai(int nilai){
            this.nilai = nilai;
        }
        
        public void healing(boolean batas){
            if(batas == true){
                setPower(1200);
                batas = false;
            }
        }

        public int getPower(){
            return this.power;
        }
        
        public void setPower(int power){
            this.power = power;
        }


        public void menendang(Musuh musuh){
            musuh.setPower(musuh.getPower()-this.damage);
        }
      
        public void reloadPeluru(boolean batas,Senjata senjata){
            if(batas == true){
                senjata.setPeluru(3);
            }
        }

        public void menembak(Musuh musuh, Senjata senjata){
            if(senjata.getPeluru() > 0){
                musuh.setPower(musuh.getPower()-senjata.getDamage());
                senjata.setPeluru(senjata.getPeluru()-1);
            }else{
                System.out.println("Peluru sudah habis");
            }
        }

        public void menusuk(Musuh musuh, Pisau pisau){
            if(pisau.getPisau() > 0){
                musuh.setPower(musuh.getPower()-pisau.getDamage());
                pisau.setPisau(pisau.getPisau()-1);
            }else{
                System.out.println("Pisau sudah habis");
            }
        }

        public int berjalan(App game, String pil, int tempat){
            game.buatLokasi();
            
            
            try{
                switch(pil){
                    case "s":
                        if(game.lokasi[x+1][y] ==  ' '){
                            x++;
                            game.lokasi[x][y] = 'O';
                        }else{
                            game.lokasi[x][y] = 'O';
                        }
                        break;
                    case "w":
                        if(game.lokasi[x-1][y]== ' '){
                            x--;
                            game.lokasi[x][y] = 'O'; 
                        }if(game.lokasi[x-1][y] == '?'){
                            x--;
                            tempat++;
                            game.lokasi[x][y] = 'O';
                        }else{
                            game.lokasi[x][y] = 'O';
                        }
                        break;
                    case "d":
                        if(game.lokasi[x][y+1]== ' '){
                            y++;
                            game.lokasi[x][y] = 'O';
                        }else{
                            game.lokasi[x][y] = 'O';
                        }
                        
                        break;
                    case "a":
                        if(game.lokasi[x][y-1]== ' '){
                            y--;
                            game.lokasi[x][y] = 'O';
                        }else{
                            game.lokasi[x][y] = 'O';
                        }
                        break;
                    default:
                        game.lokasi[x][y] = 'O';
                    }
            }catch(ArrayIndexOutOfBoundsException ex){
                    game.lokasi[x][y] = 'O';
             }
             game.validasi();
            
            return tempat;
        }

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setY(int y){
            this.y = y;
        }
        public void setX(int x){
            this.x = x;
        }

}