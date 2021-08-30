package _14_Override.OverridePractice.Okul2;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("TechnoStudy", 100);

        Ogrenci ogr1 = new Ogrenci("Deniz", "izmir", okul, UyeTipi.OGRENCİ, 5000);
        Ogrenci ogr2 = new Ogrenci("Derya", "Aydın", okul, UyeTipi.OGRENCİ, 6000);

        Calisan cal1 = new Calisan("Haluk", "İstanbul", okul, UyeTipi.CALISAN, 9000);
        Calisan cal2 = new Calisan("İpek", "İstanbul", okul, UyeTipi.CALISAN, 8000);

        okul.OgrenciKayit(ogr1);
        okul.OgrenciKayit(ogr2);

        okul.CalisanKayit(cal1);
        okul.CalisanKayit(cal2);

        System.out.print(okul);

        okul.CalisanListele();
        okul.OgrenciListele();

    }
}
