package Araba;

public class Car {
    public Pencere penceresi;
    public Kapi kapisi;
    public Model modeli = null;
    public Marka markasi = null;
    public Car(){}
    public Car(Model model,Marka marka,Kapi kapi,Pencere pencere){
        this.modeli = model;
        this.markasi = marka;
        this.kapisi = kapi;
        this.penceresi = pencere;
    }

    public void EkranaYaz() {
        System.out.println("Model"+modeli.Modelli+"marka"+markasi.Markasi+"Kapi"+kapisi.kapisi+"Pencere"+penceresi.Pencereli);
    }
}
