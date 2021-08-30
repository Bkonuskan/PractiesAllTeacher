package random;

import java.util.Scanner;

public class Ornek_2 {

    public static void main(String[] args) {

        //Console uzerinden maximum ve minimum degeri saglayiniz
        // ve buradan gelen rakamlari Math.random() da olmasini istediginiz araliga getiriniz.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen min icin bir deger giriniz");
        int min = scanner.nextInt();

        System.out.println("Lutfen max icin bir deger giriniz");
        int max = scanner.nextInt();


        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;

        System.out.println("random rakam = " + randomNumber);
    }
}
