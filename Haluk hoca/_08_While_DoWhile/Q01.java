package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
        // kullanıcıdan alınan bir stringdeki indexi tek  olan karakterleri yazdiriniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scan.nextLine();

        int i = 0;
        do {
            if (i % 2 == 1) {
                System.out.print(str.charAt(i)+" ");
            }
            i++;
        } while (i < str.length());


    }
}
