package _14_Override.OverridePractice.Sirket;

public class mainClass {
    public static void main(String[] args) {
/*
1) calisan isminde bir class oluşturun. Bu class'ta-->
        private String isim
        private String departman
        private String maas;

        a) public int zam isminde method oluşturun. 500 tl zam yapsın. return olarak maaşı döndürün
        b)void bilgilerim diye bir method oluşturun ve bilgileri yazdırın.

2)yönetici classı olusturun.  calisan classındaki bilgilere sahip olsun(inherit) ve
        int sorumluOlduguKisiSayisi veriable  oluşturun.

                Bilgilerini yazdırmak için method oluşturun.

      (  Hakan'ın maaşının zamlı hali 12000 olsun. )

main classta cağırın ve konsol böyle bir görüntü olsun :
Bilgiler Yükleniyor....
isim = Haluk
departman = Developer
maas = 12000
----------------------------------------
Bilgiler Yükleniyor....
isim = İpek
departman = QA
maas = 10000
----------------------------------------
Bilgiler Yükleniyor....
isim = Ömer
departman = Menegar
maas = 13500
Sorumlu olduğu kişi sayısı : 100

*/


        calisan developer1 = new calisan("Haluk", "Developer", 12000);//obj creat

        developer1.zam();
        developer1.Bilgilerim();


        System.out.println(" ----------------------------------");


        calisan qa1 = new calisan("İpek", "QA", 10000);//obj creat

        qa1.Bilgilerim();

        System.out.println("---------------------");

        yonetici mudur = new yonetici("Ömer", "Menegar", 13500, 100);//obj creat

        mudur.zam();//method call
        mudur.Bilgilerim();//method call

    }
}
