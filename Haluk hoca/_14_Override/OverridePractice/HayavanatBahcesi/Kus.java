package _14_Override.OverridePractice.HayavanatBahcesi;

public class Kus extends Hayvan {
    public Kus(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("öttü...");
    }
}
