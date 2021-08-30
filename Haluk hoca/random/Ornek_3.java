package random;

public class Ornek_3 {

    public static void main(String[] args) {
        //Math.random() kullanarak cikan sayinin cift ya da tek sayi olup olmamasini kontrol edin
        //Cif sayi ise sift sayi oldugunu, tek ise tek sayi oldugunu yazdiriniz

        int min = 0;
        int max = 20;

        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println("random rakam = " + randomNumber);

        //1.yol

//        if (randomNumber %2 == 0){
//            System.out.println("cift sayidir");
//        }else {
//            System.out.println("tek sayidir");
//        }

        //2.yol ternary operator ile

        String str = (randomNumber % 2 == 0) ? "cift sayidir" : "tek sayidir";
        System.out.println(str);


    }
}
