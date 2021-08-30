package _13_Inheritance._03;

public class SirketMain extends Personel {
    public static void main(String[] args) {

        Yonetici mudur = new Yonetici();

        // Personelin her fieldını kullanabiliyor
        // erişim izni olunca
        mudur.maas = 3000;
        mudur.departman = "Destek Birimi";

        // hem kendi hem de personelin metodlarını
        // kullanabiliyor.
        // Erişim izni olunca
        mudur.getMaas();
        mudur.zamYap(10);

    }
}


