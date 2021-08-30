package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("harf giriniz: ");
        String kelime = scan.nextLine();

        String sesliHarf = "aeuoiAEUOI";
        if (kelime.length()==1) {


            for (int i = 0; i <= sesliHarf.length(); i++) {
                if (kelime.charAt(0) == sesliHarf.charAt(i)) {
                    System.out.println("sesli");
                    break;
                } else {
                    System.out.println("sessiz");
                    break;
                }
            }
        }else System.out.println("Yanlis karakter girdiniz!!!");
    }
}

