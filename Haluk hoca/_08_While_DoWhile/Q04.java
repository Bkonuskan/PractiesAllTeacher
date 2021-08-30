package _08_While_DoWhile;

import java.util.Scanner;


public class Q04 {
    /*
     * kullanıcıdan alınan bir sayinin basamak degerlerinin toplamini while loop ile hesaplayan bbir method yazınız.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();


		basamakToplaDoWhile(sayi);
        basamakToplaWhile(sayi);

    }

    private static int basamakToplaDoWhile(int sayi) {
        int toplam = 0;
        do {

            toplam += sayi % 10;
            sayi = sayi / 10;

            System.out.println("Basamağın Toplamı = " + toplam + "-->  kalan sayı = " + sayi);

        }
        while (sayi > 0);
        System.out.println("Girilen sayinin basamak toplami doWhile cozumu = " + toplam);
		return toplam;

    }

    public static int basamakToplaWhile(int sayi) {

        int toplam = 0;
        while (sayi !=0) {

            toplam += sayi % 10;
            sayi /= 10;

        }
		System.out.println("Girilen sayinin basamak toplami While cozumu = "+toplam);
        return toplam;

    }


}
