package _13_Inheritance._03;


public class Yonetici extends Personel {

    public static Yonetici mudur;
    int bagliPersonelSayisi;
    double gorevTazminati;

    public void zamYap(int yuzde) {
        System.out.println("%" + yuzde + " personele zam yapıldı.");
    }

}

//  Yonetici class da hepsini tek tek yaptik.
//  Ama Yonetici2 classta
//  miras yontemi ile  daha kolay bir yontem oldu
//  Yoneticide bir personel oldugu icin sadece Yoneticiye
//  eklenecekleri ekledik
//  personel de yoneticinin kullanmayacagi bir degsiken
//  tanimlamak, inheritance yontemine engel degil


