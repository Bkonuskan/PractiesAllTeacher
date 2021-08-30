package _99_haftaninSorusu;


import java.util.Scanner;


public class _03_KelimeOyunu {
    static Scanner sc = new Scanner(System.in);
    static int oyuncu = 1;
    //static int oyuncu2=2;
    static String kelime;
    static String ekleme;
    static int puan1;
    static int puan2;

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    public static void main(String[] args) {
        System.out.print(oyuncu + ". oyuncu lütefen bir kelime giriniz : ");
        kelime = sc.next();
        System.out.println(oyuncu + ". oyuncunun girdiği kelime :" + kelime);

        oyuncuDegistir();//1. oyuncu değşiti 2. oyuncu oldu
        onaySor();
    }

    public static void oyuncuDegistir() {//bu methoda oyuncu nosu değiştiriliyor
        if (oyuncu == 1) {//oyuncu nosu 1 ise 2 olarak ata
            oyuncu = 2;
        } else oyuncu = 1;//oyuncu nosu 1 değilse 1 olarak ata
    }

    public static void onaySor() {
        System.out.println(oyuncu + ".oyuncu girilen kelimeyi kabul ediyor musunuz ?\n1: Evet \n0:Hayır");
      int kabul = sc.nextInt();
        if (kabul == 1) {// 1 tercihi girilen kelimeyi kabul ediyor demektir
            if (oyuncu == 1)//işlemi yapan oyuncu 1. oyunucu ise....
                puan2 += kelime.length();//puanı 2. oyuncuya kelime harf saysı kadar ekledik.
            else puan1 += kelime.length();//puanı 1. oyuncuya kelime harf saysı kadar ekledik.
            oyunaDevamEdecekMi();
        } else System.out.println("geçersiz kelime girdiniz.");
            oyunuBitir(); //else:0 yani girilen kelimeyi kabul etmiyor demektir
    }

    public static void oyunaDevamEdecekMi() {
        System.out.print(oyuncu+".oyuncu oyuna devam etmek istiyor musunuz? :\n1: Evet \n0:Hayır");
        int devam = sc.nextInt();
        if (devam == 1) {
            kelimeEkle();
        } else {
            oyunuBitir();
        }
    }

    public static void kelimeEkle() {
        System.out.print("eklemek istediğiniz kelimeyi giriniz");
        ekleme = sc.next();
        System.out.println("eklediğiniz kelimeyi başa mı sona mı eklemek istersiniz?\n3: Başa \n4:Son");
        int basSon = sc.nextInt();
        if (basSon == 3) kelime = ekleme + kelime;
        else kelime = kelime + ekleme;
        oyuncuDegistir();
        onaySor();
    }

    public static void oyunuBitir() {
        System.out.println("oyun bitti...");
        System.out.println("1. oyuncu puanı :" + puan1);
        System.out.println("2. oyuncu puanı :" + puan2);
        if (puan1 > puan2) {
            System.out.println("kazanan 1 oyuncu");
        }
        if (puan1 < puan2) {
            System.out.println("kazanan 2 oyuncu");
        } else System.out.println("oyun berabere bitti..");

       System.out.println("oyunu " + oyuncu + ". oyuncu oyunu kazanadı.Çünkü diğer oyuncu yanlış kelime girdi.");


    }
}