package _08_While_DoWhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Soru_17 {

    public static void main(String args[]) throws IOException {
        //kelime tahmin etme oyunu...
        String kelime = "haluk";
        int i, tahmin = 0, anahtar = 0, dogru = 0;
        String eldevar[] = new String[kelime.length()];

        System.out.println("Kelimeyi bulmak için 5 yanlış hakkınız var.");
        BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i < kelime.length(); i++) {
            eldevar[i] = "_ ";

        }

        finish:
        while (tahmin < 6) {
            System.out.println("Bir harf giriniz (Kalan hakkiniz " + (5 - tahmin) + ") : ");
            String harf = klavye.readLine();
            tahmin++;
            for (i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == harf.charAt(0)) {
                    eldevar[i] = harf + " ";
                    anahtar = 1;
                    dogru++;
                    if (dogru == kelime.length()) {
                        System.out.println("kelime " + kelime + "...Tebrikler...");
                        break finish;
                    }
                }
            }
            if (anahtar == 1) {
                anahtar = 0;
                tahmin--;
            }
            for (i = 0; i < kelime.length(); i++) {
                System.out.print(eldevar[i]);

            }
            System.out.println();
        }
        if (dogru != kelime.length()) {
            System.out.println("Uzgunum... Dogru yanit " + kelime);
        }

    }

}
