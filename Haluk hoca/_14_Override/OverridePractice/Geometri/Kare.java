package _14_Override.OverridePractice.Geometri;

public class Kare extends Dikdortgen {

    public Kare(double genislik) {
        super(genislik, genislik);

    }

    @Override
    public String toString() {
        return "Kare{" +
                "Alan =" + getAlan() +
                ", Cevre =" + getCevre() +
                '}';
    }

}
