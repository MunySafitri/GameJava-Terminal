public class lokasi2 implements Lokasi{
    int nomor = 0;
    

    public void buatLokasi(){
        String rumput = "VvV";
        for(int i = 0 ; i < lokasi.length; i++){
            for(int j = 0; j < lokasi[i].length; j++){
                lokasi[i][j] = ""+ (++nomor);
                if (lokasi[i][10]){
                    lokasi[i][j] = "||";
                    if(i>10) continue;
                }
                if (lokasi[10][j]){
                    lokasi[i][j] = "==";
                    if(j>10) continue;
                }
            }
        }
    } 
    
    public void validasi(){
        buatLokasi();
        for(int i = 0 ; i < lokasi.length; i++){
            System.out.println("||");
            for(int j = 0; j < lokasi[i].length; j++){
                if(Integer.parseInt(lokasi[i][j]))
            }
            System.out.println("||");
        }
    }
}