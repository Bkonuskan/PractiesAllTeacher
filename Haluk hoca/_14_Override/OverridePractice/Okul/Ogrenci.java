package _14_Override.OverridePractice.Okul;

public class Ogrenci {

    /*1- Ogrenci isimli id(int),isim(String) ve bolum(String)(ilk, lise)  olan bir class oluşturunuz.
      2- LiseOgrencisi adında  Ogrenci sınıfından(inherit) bir sınıf üretiniz,
      3- İlkOgrencisi adında  Ogrenci sınıfından(inherit) bir sınıf üretiniz,
      4- Okul isimli mainde 3 adet öğrenci oluşturunuz,ve ozelliklerini yazdırınız(toString)
      5- Olusturdugunuz her ogrenrenciye, Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.
    */
    int id;
    String isim;
    String bolum;


    public static int sayacID = 1000;

  public Ogrenci(int id, String isim, String bolum) {
        this.id = id;
        this.isim = isim;
        this.bolum = bolum;
    }




   @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + bolum + '\'' +
                '}';
    }

}

