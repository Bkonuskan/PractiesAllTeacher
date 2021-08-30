package _04_switchCase;

import java.util.Scanner;

public class Soru_SeyahatProjesi {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.


      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("******** Seyehat Acentemize Hoşgeldiniz ********");
        System.out.println("Frankfurt : 60 Km\n" + "Köln : 80 Km\n" + "20 Km başına 5 euro bilet parası alınmaktadir.");
        System.out.println("************************************************");

        System.out.print("Nereye yolculuk etmek istiyorsunuz:  ");
        String islem = scanner.nextLine();
        String islem2 = islem.toUpperCase();

        double toplamTutar = 0;
        double bakiye = 100;

        double FrankfurtKm = (60 / 20) * 5;
        double KolnKm = (80 / 20) * 5;

        switch (islem2) {
            default:
                System.out.println("Hatalı giriş yaptınız...");
                break;

            case "FRANKFURT":
                System.out.println("Rota = Frankfurt ");
                System.out.println("Frankfurt " + FrankfurtKm + " Euro");

                System.out.print("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir): ");
                String islem3 = scanner.nextLine();

                switch (islem3) {
                    case "1":
                        System.out.println("1 Kişilik");
                        System.out.println("İstikamet: Frankfurt - 1 Kişilik");
                        toplamTutar = FrankfurtKm;
                        break;

                    case "2":
                        System.out.println("2 Kişilik");
                        toplamTutar = FrankfurtKm * 2;
                        System.out.println("İstikamet: Frankfurt - 2 Kişilik");
                        break;

                    default:
                        System.out.println("Hatalı giriş yaptınız...");
                        break;
                }
                System.out.println("Bakiye: " + bakiye);
                System.out.println("Toplam Tutar: " + toplamTutar);
                double paraustu = bakiye - toplamTutar;
                System.out.println("Para üstü = " + paraustu);
                break;


            case "KOLN":
                System.out.println("Rota = Koln ");
                System.out.println("Koln " + KolnKm + " Euro");

                System.out.print("Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir): ");
                islem3 = scanner.nextLine();

                switch (islem3) {
                    case "1":
                        System.out.println("1 Kişilik");
                        System.out.println("İstikamet: Koln - 1 Kişilik");
                        toplamTutar = KolnKm;
                        break;

                    case "2":
                        System.out.println("2 Kişilik");
                        toplamTutar = KolnKm * 2;
                        System.out.println("İstikamet: Koln - 2 Kişilik");
                        break;

                    default:
                        System.out.println("Hatalı giriş yaptınız...");
                        break;
                }
                System.out.println("Bakiye: " + bakiye);
                System.out.println("Toplam Tutar: " + toplamTutar);
                paraustu = bakiye - toplamTutar;
                System.out.println("Para üstü = " + paraustu);


        }


    }
}
