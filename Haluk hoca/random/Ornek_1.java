package random;

public class Ornek_1 {
    /*
    Iki tane atilan zarin toplamlarinin 9 olmasi durumanda "Kazandiniz" yazisini yazdirin,
     aksi takdirde "Tekrar deneyiniz" yazisi yazmali

     */

    public static void main(String[] args) {

        int min = 1;
        int max = 6;
        int ilkAtis = (int) (Math.random() * ((max - min) + 1)) + min;
        int ikinciAtis = (int) (Math.random() * ((max - min) + 1)) + min;

        int toplam = ilkAtis + ikinciAtis;

        System.out.println(ilkAtis + " + " + ikinciAtis + " = " + toplam);

//        if (toplam == 9){
//            System.out.println("kazandiniz");
//        }else {
//            System.out.println("Tekrar deneyiniz");
//        }

        String str = (toplam == 9) ? "kazandiniz" : "Tekrar deneyiniz";

        System.out.println(str);


    }
}
