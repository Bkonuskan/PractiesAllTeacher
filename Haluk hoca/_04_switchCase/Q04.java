package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi
        Scanner scan = new Scanner(System.in);
        System.out.print(
                "Pazartesi: 1 \nSalı: 2 \nÇarşamba: 3 \nPerşembe: 4 \nCuma: 5 \nCumartesi: 6 \nPazar: 7 \nLütfen haftanın kaçıncı gününde olduğunuzu yazın: ");
        int kancıncıGun = scan.nextInt();
        System.out.println("Lütfen kaç gün sonrasını merak ettiğinizi yazın :");
        int kacGun = scan.nextInt();
        int hangiGün = (kacGun % 7 + kancıncıGun) % 7;
        if (kancıncıGun <= 7 && kancıncıGun > 0) {
            if (kacGun > 0) {
                switch (hangiGün) {
                    case 1: {
                        System.out.println(kacGun + " gün sonra günlerden Pazartesi.");
                        break;
                    }
                    case 2: {
                        System.out.println(kacGun + " gün sonra günlerden Salı.");
                        break;
                    }
                    case 3: {
                        System.out.println(kacGun + " gün sonra günlerden Çarşamba.");
                        break;
                    }
                    case 4: {
                        System.out.println(kacGun + " gün sonra günlerden Perşembe.");
                        break;
                    }
                    case 5: {
                        System.out.println(kacGun + " gün sonra günlerden Cuma.");
                        break;
                    }
                    case 6: {
                        System.out.println(kacGun + " gün sonra günlerden Cumartesi.");
                        break;
                    }
                    case 7: {
                        System.out.println(kacGun + " gün sonra günlerden Pazar.");
                        break;
                    }
                }
            } else {
                System.out.println("Geçmiş geçmişte kaldı :)");
            }
        } else {
            System.out.println("Hafta 7 gün dostum!");
        }
    }
}

