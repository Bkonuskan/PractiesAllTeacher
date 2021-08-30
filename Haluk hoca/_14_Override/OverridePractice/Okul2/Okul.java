package _14_Override.OverridePractice.Okul2;

import java.util.ArrayList;

    /*Ogrenci ve Calisanlar okula kayıt yapılacağından
    kayıt işlemi Okul sınıfının içerisinde olmalı,
    bu yüzden ArrayList ler ve kayıt işlemi Okul
     sınıfın içine yazıldı.*/

public class Okul {
    private String isim;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrencileri = new ArrayList<>();
    private ArrayList<Calisan> calisanlari = new ArrayList<>();

    public Okul(String isim, int maxOgrenciSayisi) {
        setIsim(isim);
        setMaxOgrenciSayisi(maxOgrenciSayisi);

        ogrencileri = new ArrayList<>();
        calisanlari = new ArrayList<>();
    }

    public void OgrenciKayit(Ogrenci ogr) {
        ogrencileri.add(ogr);
    }

    public void CalisanKayit(Calisan cal) {
        calisanlari.add(cal);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrencileri() {
        return ogrencileri;
    }

    public void setOgrencileri(ArrayList<Ogrenci> ogrencileri) {
        this.ogrencileri = ogrencileri;
    }

    public ArrayList<Calisan> getCalisanlari() {
        return calisanlari;
    }

    public void setCalisanlari(ArrayList<Calisan> calisanlari) {
        this.calisanlari = calisanlari;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "isim='" + isim + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrencileri=" + ogrencileri +
                ", calisanlari=" + calisanlari +
                '}';
    }

    public void OgrenciListele() {
        for (Ogrenci ogr : ogrencileri) {
            System.out.println(ogr);
        }
    }

    public void CalisanListele() {
        for (Calisan cal : calisanlari) {
            System.out.println(cal);
        }
    }

}