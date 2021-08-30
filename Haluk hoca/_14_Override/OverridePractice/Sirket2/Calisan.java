package _14_Override.OverridePractice.Sirket2;

public class Calisan {
    private String isim;
    protected double maas; //bu değişkene bu sınıftan üretilenler  ulaşabilir.
    int maasKatsayisi;

    public Calisan(String ismi, double maas, int maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public double maasHesapla() {
        return this.maas * this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Clısan{" +
                "ismi='" + isim + '\'' +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
