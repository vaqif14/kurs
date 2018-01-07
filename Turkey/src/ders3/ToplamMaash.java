package ders3;

import java.util.Arrays;

public class ToplamMaash {
    public static void main(String[] args){
        GenelMudur g = new GenelMudur();
        Mudur m = new Mudur();
        Programci p = new Programci();
        Calishan [] calishanlar = {g,m,p};
        int toplam  = 0;
        for(Calishan s : calishanlar){
            toplam += s.Maash();
        }
        System.out.println("Toplam:" +toplam);
        int [] sira ={1,2,3,4};
        Arrays.sort(sira);
        for (int i = 1;i<5;i++){
        }
    }

}
