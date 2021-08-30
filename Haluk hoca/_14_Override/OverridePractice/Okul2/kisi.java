package _14_Override.OverridePractice.Okul2;

public class kisi {

    private String isim;
    private String adres;
    private Okul okul;
    private UyeTipi uyeTipi;

    public kisi(String isim, String adres, Okul okul, UyeTipi uyeTipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUyeTipi(uyeTipi);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }

    public void setUyeTipi(UyeTipi uyeTipi) {
        this.uyeTipi = uyeTipi;
    }

    @Override
    public String toString() {
        return "kisi{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ",okul = " + getOkul().getIsim() +
                //              ", okul=" + okul +
                /* bu bölüm mainde okul toString metodu çalıştırılınca
                çalısan ve öğrencinin üst classı olan kişi sınıfındaki
                buradaki okul değşkenini tekrar çağırarak sonsuz döngü
                oluşturduğundan RUNTİME hatası verdi.
                 Main de

                 HuseyinBYCalısma.println(okul)-> okul.toString(); -> ogrencileri (Ogrenci.toString) -> kisi.toString() -> okul.toString()*/

                ", uyeTipi=" + uyeTipi +
                '}';
    }
}
