public class Lokasi2 implements Lokasi{
    public char[][] buatLokasi(){
        
        for(int i = 0 ; i < lokasi.length; i++){
            for(int j = 0; j < lokasi[i].length; j++){
                lokasi[i][j] = ' ' ;  
            }
            lokasi[0][3] = '?';
            lokasi[0][2]='\\';
            lokasi[0][4]='/';
        }
        return lokasi;
    }   
}