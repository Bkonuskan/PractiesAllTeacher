package _99_haftaninSorusu;

import java.util.Random;
import java.util.Scanner;

public class _06_SayiTahminKredili {
    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         */
        // Random rnd = new Random(); - int sayi = rnd.nextInt(101); ===> random
        // class'indan random objesini kullaniyorum. Sonrasinda 'rnd' methodu ile
        // tahminin sinirini belirleyip
        // bunu bir variable'a assign ediyorum.
        System.out.println("***SAYI TAHMIN ETME OYUNU'NA HOS GELDINIZ***");
        System.out.println("                'KURALLAR'");
        System.out
                .println("1- 0 ile 100 arasindaki rastgele bir tamsayiyi minimum denemeyle dogru tahmin etmelisiniz.");
        System.out.println("2- Oyuna 100 kredi ile baslarsiniz.");
        System.out.println(
                "3- Ilk 3 tahmininizde krediniz eksilmez. Bu tahmin haklari oyun tarafindan size verilmis hediyelerdir.");
        System.out.println(
                "4- Ilk seferde dogru tahminde bulunursaniz oyuna basladiginiz kredinin '3' katini, \n   Ikinci seferde dogru tahminde bulunursaniz '2' katini, \n   Ucuncu seferde dogru tahminde bulunursaniz kendisini kazanirsiniz. \n   3'ten sonraki "
                        + "her denemizde kredi miktarinizdan 10 puan kesilir bu denemelerde dogru tahmin de bulunsaniz bile ekstra bir odul kazanamazsiniz.");
        System.out.println(
                "5- Kredi miktariniz kritik seviyeye indiginde (30) oyun size 1 defaliga mahsus 'Mevcut krediniz ile yeni bir oyuna baslamak ister misiniz?' diye sorar. \n   Sonrasinda "
                        + "yukaridaki asamalar tekrarlanir.");
        System.out.println(
                "6- Eger oyunu kazanirsaniz yeni bir oyun talebinde bulunabilirsiniz. \n   Yeni oyun talebi ile farkli bir oyuna basladiginiz icin bu oyunda da bir ekstra oyun hakkina"
                        + " sahip olursunuz.");
        System.out.println("BASARILAR!..");
        char mevcutKrediIleYeniOyun = 'E';
        int kazanilanKredi = 0;
        int oyunSayisi = 1;
        int kredi = 100;
        do {
            Scanner scan = new Scanner(System.in);
            Random rnd = new Random();
            int sayi = rnd.nextInt(101);
            int sayac = 1;
            int ekstraHak = 1;
            int tahmin = 0;
            if (oyunSayisi > 1) {
                kredi = kazanilanKredi;
            }
            char oyunuKazandi = 'H';
            char yeniOyun = 'E';
            do {
                System.out.println("Lutfen " + sayac + ". tahmininizi giriniz: ");
                tahmin = scan.nextInt();
                if (sayi == tahmin) {
                    oyunuKazandi = 'E';
                    if (sayac < 4) {
                        switch (sayac) {
                            case 1:
                                kredi += kredi * 3;
                                System.out.println("*Tebrikler kazandiniz!* \n Mevcut krediniz " + kredi);
                                System.out.println(
                                        "Mevcut krediniz ile yeni bir oyuna baslamak istiyorsaniz 'EVET' istemiyorsaniz 'HAYIR' yazin: ");
                                mevcutKrediIleYeniOyun = scan.next().toUpperCase().charAt(0);
                                kazanilanKredi = kredi;
                                oyunSayisi++;
                                break;
                            case 2:
                                kredi += kredi * 2;
                                System.out.println("*Tebrikler kazandiniz!* \n Mevcut krediniz " + kredi);
                                System.out.println(
                                        "Mevcut krediniz ile yeni bir oyuna baslamak istiyorsaniz 'EVET' istemiyorsaniz 'HAYIR' yazin: ");
                                mevcutKrediIleYeniOyun = scan.next().toUpperCase().charAt(0);
                                kazanilanKredi = kredi;
                                oyunSayisi++;
                                break;
                            case 3:
                                kredi += kredi;
                                System.out.println("*Tebrikler kazandiniz!* \n Mevcut krediniz " + kredi);
                                System.out.println(
                                        "Mevcut krediniz ile yeni bir oyuna baslamak istiyorsaniz 'EVET' istemiyorsaniz 'HAYIR' yazin: ");
                                mevcutKrediIleYeniOyun = scan.next().toUpperCase().charAt(0);
                                kazanilanKredi = kredi;
                                oyunSayisi++;
                                break;
                        }
                    } else {
                        kredi = kredi;
                        System.out.println("*Tebrikler kazandiniz!* \n Mevcut krediniz " + kredi);
                        System.out.println(
                                "Mevcut krediniz ile yeni bir oyuna baslamak istiyorsaniz 'EVET' istemiyorsaniz 'HAYIR' yazin: ");
                        mevcutKrediIleYeniOyun = scan.next().toUpperCase().charAt(0);
                        kazanilanKredi = kredi;
                        oyunSayisi++;
                        break;
                    }
                }
                if (sayac > 3) {
                    kredi = kredi - 10;
                }
                if (kredi <= 30 && ekstraHak == 1) {
                    ekstraHak++;
                    System.out.println(
                            "Kredi miktariniz kritik seviyeye indi. Dilerseniz mevcut krediniz ile bir defaliga mahsus olmak uzere yeni bir oyuna baslayabilirsiniz. \nYeni"
                                    + "bir oyuna baslanmak istiyorsaniz 'EVET' yazin.");
                    yeniOyun = scan.next().toUpperCase().charAt(0);
                    if (yeniOyun == 'E') {
                        int ekstraOyununKredisi = ekstraOyun(kredi);
                        if (ekstraOyununKredisi > 0) {
                            System.out.println("Mevcut krediniz: " + ekstraOyununKredisi);
                            System.out.println(
                                    "Mevcut krediniz ile yeni bir oyuna baslamak istiyorsaniz 'EVET' istemiyorsaniz 'HAYIR' yazin: ");
                            mevcutKrediIleYeniOyun = scan.next().toUpperCase().charAt(0);
                            kazanilanKredi = ekstraOyununKredisi;
                            oyunSayisi++;
                            break;
                        }
                        else if (ekstraOyununKredisi <= 0) {
                            kredi = ekstraOyununKredisi;
                            break;
                        }
                    } else {
                    }
                }
                System.out.println("Mevcut krediniz: " + kredi);
                sayac++;
            } while (kredi > 0 && oyunuKazandi == 'H');
            if (oyunuKazandi == 'H') {
                System.out.println("Uzgunum, kaybettiniz");
            }
        } while (mevcutKrediIleYeniOyun == 'E' && kredi > 0);
        System.out.println("En yakin zamanda tekrar gorusmek uzere!..");
    }
    private static int ekstraOyun(int kredi) {
        System.out.println(kredi);
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int sayi = rnd.nextInt(101);
        int sayac = 1;
        int ekstraHak = 1;
        int tahmin = 0;
        char oyunuKazandi = 'H';
        char yeniOyun = 'E';
        int mevcutKredi = kredi;
        do {
            System.out.println("Mevcut krediniz: " + mevcutKredi);
            System.out.println("Lutfen " + sayac + ". tahmininizi giriniz: ");
            tahmin = scan.nextInt();
            if (sayi == tahmin) {
                oyunuKazandi = 'E';
                if (sayac < 4) {
                    switch (sayac) {
                        case 1:
                            mevcutKredi += mevcutKredi * 3;
                            System.out.println("*Tebrikler kazandiniz!*");
                            break;
                        case 2:
                            mevcutKredi += mevcutKredi * 2;
                            System.out.println("*Tebrikler kazandiniz!*");
                            break;
                        case 3:
                            mevcutKredi += mevcutKredi;
                            System.out.println("*Tebrikler kazandiniz!*");
                            break;
                    }
                } else {
                    mevcutKredi = mevcutKredi;
                    System.out.println("*Tebrikler kazandiniz!*");
                }
            }
            if (sayac > 3) {
                mevcutKredi = mevcutKredi - 10;
            }
            sayac++;
        } while (mevcutKredi > 0 && oyunuKazandi == 'H');
        return mevcutKredi;
    }
}
