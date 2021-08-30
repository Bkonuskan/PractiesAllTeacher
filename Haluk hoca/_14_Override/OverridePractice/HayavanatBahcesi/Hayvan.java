package _14_Override.OverridePractice.HayavanatBahcesi;

public class Hayvan {
    // Hayvan sınıfı superclass olmak üzere köpek,
    // kedi ve kuş sınıfları üreteceğiz.
    String renk;
    int kilo;
    String cinsi;


    public Hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }


    public void konustu() {
        System.out.println("konuştu..");
    }

    public void yemekYer() {
        System.out.println("Yemek yer..");
    }


    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

}

