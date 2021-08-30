package _12_Encapsulation.Ex9;

import java.util.Scanner;

public class _03_Encapsulation3 {

/* TODO
    Burada iki class vardır. Biri Main diğeri ise Subscribe.
    Subscribe class'ının içinde;
    Bu variables'ları private oluşturunuz.
    String name
    boolean doYouWanaSubscribe
    String whichMember
    3 tip memberShip(üyelik) seviyesi vardır. Gold, Silver ve Bronze (Altın, gümüş ve bronz)

todo    Main class'ın içinde;
    Örnek;
    Name is Victoria, doYouWanaSubscribe true, whichMember Gold
    Eğer user(kullanıcı) Gold member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos ,
    all homework and see you soon. yazdırınız.

    Eğer user(kullanıcı) Silver member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework. yazdırınız.

    Eğer user(kullanıcı) Bronze member(üye) olmak istiyorsa;
    Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos. yazdırınız.

    Eğer user(kullanıcı) member(üye) olmak istemiyorsa;
    See you when you want to be a member. Thanks yazdırınız.
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("adınızı giriniz : ");
        String name = scan.nextLine();
        System.out.println("sectiginiz uyeligi giriniz : ");
        String uyelikTercihi = scan.nextLine();
        System.out.println("abonelik tercihinizi giriniz(true/false) : ");
        boolean abonelikTercihi = scan.nextBoolean();
//  BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve subscribe class'ında setter'ı ayarlarken bu variable'ları kullanınız.


        Subscribe abone = new Subscribe();
        abone.setName(name);
        abone.setWhichMember(uyelikTercihi);
        abone.setDoYouWanaSubscribe(abonelikTercihi);

        if (abone.getDoYouWanaSubscribe() == true) {

            if (abone.getWhichMember().equalsIgnoreCase("Gold")) {
                System.out.println("Welcome to membership " + abone.getName() + ". Your membership is 40 dollar for month you can enjoy " +
                        "the videos , all homework and see you soon.");
            }

           else if (abone.getWhichMember().equalsIgnoreCase("Silver")) {
                System.out.println("Welcome to membership " + abone.getName() + ". Your membership is 20 dollar " +
                        "for month you can enjoy the videos and all homework.");
            }

           else if (abone.getWhichMember().equalsIgnoreCase("Bronze")) {
                System.out.println("Welcome to membership " + abone.getName() + ". Your membership is 10 dollar " +
                        "for month you can enjoy the videos.");
            }

        }

       else if (abone.getDoYouWanaSubscribe() == false) {
            System.out.println("See you " + abone.getName() + " when you want to be a member. Thanks");
        }


    }
}

