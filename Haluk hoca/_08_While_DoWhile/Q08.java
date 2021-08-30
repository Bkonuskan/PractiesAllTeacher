package _08_While_DoWhile;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {
//TODO INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        Scanner scan = new Scanner(System.in);

        System.out.print("PIN kodunuzu giriniz : ");
        int userPin = scan.nextInt();

        int pinCode = 1453;

        while (userPin != pinCode) {
            System.out.println("********** Yanlış PIN **********");
            System.out.println("Tekrar Deneyiniz");
            userPin = scan.nextInt(); //tekrar pin isteyerek kodu devam ettirecek...
        }
        System.out.println("Gayet BAŞARILI pin  onaylandi :)");
    }
}

