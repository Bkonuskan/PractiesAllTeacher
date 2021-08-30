package _88_Odev;

public class Ex04 {

    public static void main(String[] args) {

//      *
//     **
//    * *
//   *  *
//  *   *
// *    *
//*******  şekli konsola  yazdırınız...

        for (int satir = 1; satir <= 7; satir++) {
            // uçgen dısı bosluk icin
            for (int bosluk = 1; bosluk <= 7 - satir; bosluk++)//sola dayalı olması için bu for yoruma alınmalı ama soru saga dayalı olg için bu blok yazıldı
                System.out.print(" ");

            //ucgen kenarlarindaki '*' icin
            for (int sutun = 1; sutun <= satir; sutun++) {
                // kenarlarda "*" yazmak icin
                if (satir == 7 || sutun == 1 || sutun == satir)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
