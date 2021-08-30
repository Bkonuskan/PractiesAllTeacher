package _14_Override.OverridePractice.Okul2;

public class Ogrenci extends kisi {
    private double OkulUcret;

    public Ogrenci(String isim, String adres, Okul okul, UyeTipi üyeTipi, double OkulUcret) {
        super(isim, adres, okul, üyeTipi);
        setOkulUcret(OkulUcret);
    }

    public double getOkulUcret() {
        return OkulUcret;
    }

    public void setOkulUcret(double okulUcret) {
        OkulUcret = okulUcret;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getOkulUcret();
    }
}
