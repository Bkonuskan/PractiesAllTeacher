package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        // Kullanıcıdan alınan bir metinde  x  girilene kadar ekrana "Gayet BAŞARILI program çalışıyor :) " yazan
        // ve x girildiğinde ise "Program bitti :( " yazan programı yazınız.

        Scanner scan = new Scanner(System.in);

        String str="" ;

        do {
            System.out.print("başarılı bir metin giriniz : ");
            str = scan.nextLine();
            if (str.equalsIgnoreCase("x")) {
                System.out.println("Program bitti :( ");
                break;
            }
            System.out.println("Gayet BAŞARILI program çalışıyor :) ");

            break; //kaldırırsak pr devam eder
        } while (!str.equalsIgnoreCase("x"));


    }
}
