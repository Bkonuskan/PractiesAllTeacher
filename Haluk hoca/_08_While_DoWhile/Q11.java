package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        //TODO STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

     String pin_sys = "Hu.180884";

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Pin kodunuzu giriniz: ");
        String pin = scan.nextLine();

   /*     while (!pin.equals(pin_sys)){
            System.out.println("Yanlış pin kodu girdiniz.");
             pin = scan.nextLine();
        }
         System.out.println("Başarı ile giriş yapıldı...");


*/

        int kalanHak = 3;





    /*    do {
            System.out.print("Lütfen Pin kodunuzu giriniz: ");


            if (pin_sys.equals(pin)){
                System.out.println("Başarı ile giriş yaptınız...");
                break;
            }
            else {
                System.out.println("Yanlış pin kodu girdiniz...");
                kalanHak--;
                System.out.println("Kalan hakkınız: " + kalanHak);
            }

    }while (kalanHak > 0);
        if (kalanHak == 0)
        System.out.println("Giriş hakkınız bitti...");

*/

        int giris_hakki = 3;

        System.out.println("***************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("***************************");

        while (true) {
            System.out.print("Pin kodunuzu giriniz: ");


            if (pin.equals(pin_sys)) {
                System.out.println("Başarı ile giriş yaptınız...");
                break;
            } else {
                System.out.println("Yanlış giriş yaptınız...");
                giris_hakki -= 1;
                System.out.println("Giriş hakkınız: " + giris_hakki);
            }

            if (giris_hakki == 0) {
                System.out.println("Giriş hakkınız kalmadı. Tekrar bekleriz...");
                break;
            }
        }


    }


}
