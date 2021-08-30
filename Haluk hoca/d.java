import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class d {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string. (Ignore case sensitivity)
       input : Learning java is easy
       output: maximumCounts occurring character is : a  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir bir string giriniz :");
        String str = scan.nextLine().toLowerCase();
        //  System.out.println(str);
        String arr[] = str.split("");
        //System.out.println(Arrays.toString(arr));
        String encokTekrarEden = "";
        List<String> karakterler = new ArrayList<>();
        //System.out.println(karakterler);
        int maxSayac = 0;
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    sayac++;
                }}
            if (sayac > maxSayac) {
                maxSayac = sayac;
                encokTekrarEden = arr[i];
            } else if (sayac == maxSayac) {
                encokTekrarEden += ", " + arr[i];
            }
            sayac = 0;
        }
        if (encokTekrarEden.length() > 1) {
            System.out.println("maximumCounts occurring characters are : " + encokTekrarEden);
        } else {
            System.out.println("maximumCounts occurring character is : " + encokTekrarEden);
        }
    }
}

