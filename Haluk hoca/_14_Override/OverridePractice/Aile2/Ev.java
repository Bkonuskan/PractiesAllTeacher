package _14_Override.OverridePractice.Aile2;

public class Ev {

    public static void main(String[] args) {
        BuyukDede buyukDede = new BuyukDede();  // ctrl+alt+v
        buyukDede.isim = "Haci Ahmet";
        buyukDede.soyisim = "Hasanoglu";
        buyukDede.yas = 100;
        buyukDede.meslek = "Ciftci";
        buyukDede.tatlisever = true;

        System.out.println(buyukDede);

        Dede dede = new Dede("Mustafa");
        dede.boy = 170;
        dede.torun = 15;
        dede.baston = false;
        System.out.println("----------------------");
        System.out.println(dede);


    }
}
