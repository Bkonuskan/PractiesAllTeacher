package _14_Override.OverridePractice.Aile2;

public class Baba extends Dede {

    boolean araba;

    public Baba() {

    }

    public Baba(String isim) {
        super(isim);
    }

    @Override
    public String toString() {
        return "Baba{" +
                "araba=" + araba +
                ", boy=" + boy +
                ", torun=" + torun +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", meslek='" + meslek + '\'' +
                ", tatlisever=" + tatlisever +
                '}';
    }
}
