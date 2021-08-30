package _88_Odev;

import java.util.Scanner;

public class Ex03 {



    /* Problem Tanımı
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)
        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365
        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

        !her sayıda dogru veriyor 15 ile 4 ? 2 veriyor
      */
    public static void main(String[] args) {


        Scanner klavye = new Scanner(System.in);
        System.out.print("N Değerini Giriniz : ");
        int n = klavye.nextInt();

        System.out.print("R Değerini Giriniz : ");
        int r = klavye.nextInt();

        int faktoriyel_1 = 1;
        int faktoriyel_2 = 1;
        int faktoriyel_3 = 1;
        int fark = n - r;

        for (int i = 1; i <= n; i++) {

            faktoriyel_1 = faktoriyel_1 * i;
        }
        System.out.println("N Sayısının Faktöriyeli : " + faktoriyel_1);

        for (int j = 1; j <= r; j++) {

            faktoriyel_2 = faktoriyel_2 * j;
        }
        System.out.println("R Sayısının Faktöriyeli : " + faktoriyel_2);

        for (int k = 1; k <= fark; k++) {

            faktoriyel_3 = faktoriyel_3 * k;
        }
        System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);

        int carpim = faktoriyel_2 * faktoriyel_3;
        int kombinasyon = faktoriyel_1 / carpim;

        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }
}
