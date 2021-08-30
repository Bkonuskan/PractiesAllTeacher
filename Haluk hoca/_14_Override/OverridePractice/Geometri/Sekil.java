package _14_Override.OverridePractice.Geometri;

public class Sekil {
    // 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
    //Shape
    //  Circle (bu türün alan hesaplaması yok)
    //  Rectangle
    //      Square

    // 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
    // 3- Her bir sınıfa consructor ekleyiniz.
    // 4- Her metodun toStringini override yapınız.
    // 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
    // 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
    // 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hta mesajı ürettiriniz.
    //
    // Sekil
    //   Cember
    //   Dikdortgen
    //         Kare

    @Override
    public String toString() {
        return "Sekil : Bilgi yok ";
    }

    public double getAlan() {
        throw new RuntimeException("Bu sınıfa bu metod implemente edilmemiştir.");
    }

    public double getCevre() {
        throw new RuntimeException("Bu sınıfa bu metod implemente edilmemiştir.");
    }
}
