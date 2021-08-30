package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    static int bolum = 0; //class level de bir veriable

    public static void main(String[] args) {
        // kullanicidan bolunen ve bolen seklinde 2 sayi alip bolme operatoru
        //kullanmadan bolme islemini gerceklestiip yazdiran bir method kodlayiniz.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bolunecek sayiyi giriniz : ");
        int bolunen = scan.nextInt();

        System.out.print("Lutfen bolen sayiyi giriniz : ");
        int bolen = scan.nextInt();

        System.out.println("Bolme isleminin sonucu: " + bolme(bolunen, bolen));
    }

    public static int bolme(int bolunen, int bolen) {


        while (bolunen >= bolen) { //10= 10-2  					bolum
            bolunen -= bolen;//bolunen=bolunen-bolen 10 = 10-2  		1

            bolum++;
        }
        return bolum;


    }

}


