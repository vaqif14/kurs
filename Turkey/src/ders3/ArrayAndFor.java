package ders3;

public class ArrayAndFor {
    public static void main(String[] args) {
        int [ ] sayila = {2,3,4,5,6};
        String [] hafta = new String[8];
        hafta[1] = "Monday";
        hafta[2] = "Thusday";
        hafta[3] = "Wensday";
        hafta[4] = "Thursday";
        hafta[5] = "Friday";
        hafta[6] = "Saturday";
        hafta[7] = "Sunday";
        for (int i = 1 ; i<hafta.length;i++){
            System.out.println(hafta[i]);
        }
        int c=0;
        for (int b = 1; b<sayila.length;b++){
//            System.out.println(sayila[b]);
            c = c+sayila[b];
        } System.out.println(c);
    }
}
