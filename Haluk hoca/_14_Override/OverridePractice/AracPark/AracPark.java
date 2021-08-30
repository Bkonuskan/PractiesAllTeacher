package _14_Override.OverridePractice.AracPark;

public class AracPark {
    public static void main(String[] args) {

        Otobus otobus1 = new Otobus("beyaz", 3000, "toyota", 35);
        System.out.println("otobus1 = " + otobus1);//burada otomatik toString çağırılır.

    }
}

