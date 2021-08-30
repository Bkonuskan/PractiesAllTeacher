package _99_haftaninSorusu;

import java.util.Scanner;

public class _02_PasswordMethodCozum {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("password girisi yapiniz : ");
        String password = scan.nextLine();
        passControl(password);
        System.out.println("   ***   ");
        passControlAscii(password);
    }

    public static void passControl(String password) {

        boolean passUzunluk = password.length() >= 8;
        boolean passKucukHarf = password.matches(".*[a-z].*");  //   .*[a-z].*
        boolean passBuyukHarf = password.matches(".*[A-Z].*");  //
        boolean passRakam = password.matches(".*[0-9].*");
        boolean passKarakter = password.matches(".*[!@.,#$?].*");

        boolean passGecerliMi = passUzunluk && passKucukHarf && passBuyukHarf && passRakam && passKarakter;

        if (passGecerliMi) {
            System.out.println("Password'unuz GECERLI...");
        } else {
            System.out.println("Password'unuz GECERLI DEGIL !!!...");
        }
    }

    public static void passControlAscii(String password) {


        boolean passUzunluk = password.length() >= 8;
        boolean passKucukHarf = false;
        boolean passBuyukHarf = false;
        boolean passRakam = false;
        boolean passKarakter = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c >= 97 && c <= 122)
                passKucukHarf = true;
            if (c >= 65 && c <= 90)
                passBuyukHarf = true;
            if (c >= 48 && c <= 57)
                passRakam = true;
            if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126))
                passKarakter = true;

        }

        if (!passUzunluk) {
            System.out.println("Password UZUNLUGU yetersiz!!!...");
        } else if (!passKucukHarf) {
            System.out.println("Password'unuzde KUCUK HARF kullanılmamıs!!!...");
        } else if (!passBuyukHarf) {
            System.out.println("Password'unuzde BUYUK HARF kullanılmamıs!!!...");
        } else if (!passRakam) {
            System.out.println("Password'unuzde RAKAM kullanılmamıs!!!...");
        } else if (!passKarakter) {
            System.out.println("Password'unuzde KARAKTER kullanılmamıs!!!...");
        } else {
            System.out.println("Password'unuz GECERLI...");
        }
    }
}

