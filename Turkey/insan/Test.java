package com.insan;

public class Test {
    public static void main(String[] args){
        Goz g = new Goz("Mavi");
        Kulak k = new Kulak("Kepce");
        Burun b = new Burun("Kemer");
        Kafa kafa = new Kafa(g,k,b);
        Insan y = new Insan("Vaqif","Gulmammadov",kafa);
        y.EkranaYaz();
    }
}
