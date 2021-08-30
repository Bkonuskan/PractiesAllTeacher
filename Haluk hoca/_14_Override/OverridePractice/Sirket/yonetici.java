package _14_Override.OverridePractice.Sirket;

public class yonetici extends calisan {
    private int sorumluOlduguKisiSayisi;

  public yonetici(String isim, String departman, int maas, int sorumluOlduguKisiSayisi) {
        super(isim, departman, maas);
        this.sorumluOlduguKisiSayisi = sorumluOlduguKisiSayisi;
    }



    @Override
    public void Bilgilerim() {//overriding cunku bilgilerime yeni veri girecegim özel hale getircegim
        super.Bilgilerim();
        System.out.println("Sorumlu olduğu kişi sayısı: " + this.sorumluOlduguKisiSayisi);
    }


}

