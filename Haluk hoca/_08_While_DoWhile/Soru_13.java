package _08_While_DoWhile;

import java.util.Scanner;

public class Soru_13 {

    public static void main(String[] args) {

        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int count = 0;
        int sayi = 0;

        do {
            System.out.println("0 harici sayilarinizi girin ve bittigi zaman 0'a basiniz");
            sayi = scan.nextInt();
            count++;
            toplam+=sayi;
            if (toplam>100) {
                System.out.println(count + " adet sayi girdiniz toplami " + toplam + " Bu kadar sayi yeter..");
                System.out.println("GAME OVER");
                break;
            }
        }while(toplam<100 && sayi!=0); {
            if(toplam<100) {
                System.out.println(count + " Adet sayi yazdin " + "toplamlari " + toplam);
                do {
                    System.out.println("Toplam 100'u gecemedi bir daha yazar misin ? Bittigi zaman 0'a bas");
                    sayi = scan.nextInt();
                    count++;
                    toplam+=sayi;
                    if (toplam>100) {
                        System.out.println(count + " adet sayi girdiniz toplami " + toplam + " Bu kadar sayi yeter..");
                        System.out.println("GAME OVER");
                        break;
                    }
                } while(toplam<100 && sayi!=0); {
                    System.out.println("Uzgunum 100'u gecemedin " +count+ " adet sayilarinin toplami " + toplam);
                    System.out.println("GAME OVER");
                }
                if (toplam>=100) {
                    System.out.println(count + " adet sayi girdiniz . Bu kadar sayi yeter..");
                    System.out.println("Toplami " + toplam);
                    System.out.println("GAME OVER");
                }
            }

        }
    }
}
