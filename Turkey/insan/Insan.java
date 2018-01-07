package com.insan;

public class Insan {
        public Kafa k = null;
        public String ad = null;
        public String Soyad = null;
    public Insan() {
        }
    public Insan(String adi, String Soyadi, Kafa kafa) {
            ad = adi;
            Soyad = Soyadi;
            k = kafa;
        }
        public void EkranaYaz() {
            System.out.println("Kishinin adi:" + ad + "Soyad" + Soyad + "Goz Rengi" + k.g.Renk + "Kulak" + k.k.Tipi + "burnu" + k.b.Tipi);
        }
    }



