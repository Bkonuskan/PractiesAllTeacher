package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz :");
        String str = scan.nextLine().toLowerCase();

        ilkIkiHaric(str);

        scan.close();

    }

    public static void  ilkIkiHaric (String s) {

        if(s.startsWith("gh")) {
            System.out.println(s);
        }else if (s.startsWith("g")) {
            System.out.println((s.charAt(0))+(s.substring(2)));
        }else if (s.charAt(1)== 'h') {
            System.out.println(s.substring(1));
        }else {
            System.out.println(s.substring(2));
        }

    }
}
