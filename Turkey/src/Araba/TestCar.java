package Araba;

public class TestCar {
    public static void main(String [] args){
        Model m = new Model("BMW");
        Marka mark = new Marka("X5");
        Pencere p = new Pencere(6);
        Kapi k = new Kapi(5);
        Car car = new Car(m,mark,k,p);
        car.EkranaYaz();

    }
}
