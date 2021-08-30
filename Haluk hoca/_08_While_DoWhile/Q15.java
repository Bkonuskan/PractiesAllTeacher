package _08_While_DoWhile;

import java.util.Scanner;

public class Q15 {

    //belirli bir(kullanıcı girecek)  yükseklikten bir top serbes dusme ile bırakilımaktadir.
    // top serbest bırakıldıktan  sonra sürekli birakildigi yüksekliğin ¾ 75 'İ kadar zeminden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde olay sonlandirilmaktadir.
    // Bu ana kadar topun toplam aldığı yolu ve topun zemine  vurma sayısını bulunuz.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakilacagi yuksekligi giriniz : ");

        double birakilanYukseklik = scan.nextDouble();
        int vurmaSayisi =0;
        double toplamyol = birakilanYukseklik;

        while (birakilanYukseklik >= 1) {
            birakilanYukseklik = birakilanYukseklik * (0.75);

            toplamyol = toplamyol + (2 * birakilanYukseklik);
            vurmaSayisi++;

        }
        System.out.println("topun zemine vurma sayisi = " + vurmaSayisi);
        System.out.println("Topun toplam aldigi yol = " + toplamyol);

    }
}
