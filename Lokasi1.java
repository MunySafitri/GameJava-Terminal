public class Lokasi1 implements Lokasi{
    public char[][] buatLokasi(){
        int nomor =0;
        for(int i = 0 ; i < lokasi.length; i++){
            for(int j = 0; j < lokasi[i].length; j++){
                lokasi[i][j] = ' ' ;  
                if (lokasi[i][6] == ' '){
                    if(i>5) continue;
                    lokasi[i][j] = '+';
                }if(lokasi[5][j] == ' '){
                    if(j>3) continue;
                    else if(j>6) continue;                  
                      lokasi[i][j] = '+';
                }
            }
             lokasi[0][3] = '?';
             lokasi[0][2]='\\';
             lokasi[0][4]='/';
             lokasi[0][14]='V';
             lokasi[3][19]='V';
             lokasi[7][10]='v';
             lokasi[9][5]='v';
        }
        return lokasi;
    }

       
}