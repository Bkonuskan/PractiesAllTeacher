package random;

public class Random_nedir {

    public static void main(String[] args) {


        Math.random();  //0.0 ve 1.0 arasinda bir deger veriyor
        double random = Math.random();

        //eger tam sayi olarak bir deger istiyorsak *10 gibi bir sayi ile carpabiliriz.

        //eger ki bir deger araliginda olacak sekilde bir random rakam istiyorsak o zaman bize
        //verilen formulu kullanabiliriz.

        //(int) (Math.random() * ((max - min) + 1)) + min;


        //todo ornek

        int min = 0;
        int max = 15;

        int randomNumber = (int) (Math.random() * ((max - min) + 1)) + min;
        System.out.println(randomNumber);


    }
}
