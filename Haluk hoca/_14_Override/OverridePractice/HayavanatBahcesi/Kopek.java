package _14_Override.OverridePractice.HayavanatBahcesi;

public class Kopek extends Hayvan {

    public Kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi); // super : superclass ı işaret eder
    }

    @Override
    public void konustu() {
        System.out.println("havladı...");
    }
}
