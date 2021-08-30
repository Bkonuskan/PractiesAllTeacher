package _14_Override.OverridePractice.Okul;



public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi lo1 = new LiseOgrencisi("ahmet", "lise");
        LiseOgrencisi lo2 = new LiseOgrencisi("ali", "lise");

        ilkOgrenci io1 = new ilkOgrenci("ayşe", "ilk");
        ilkOgrenci io2 = new ilkOgrenci("mehmet", "ilk");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io2 = " + io2);
        System.out.println("io1 = " + io1);

    }
}
