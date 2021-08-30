package _12_Encapsulation.Ex11;

import java.util.Scanner;

public class _05_Encapsulation5 {

/* TODO
    Book class'ı verilmiştir.
    İki tane attributes oluşturunuz.
    bookName ve authorName (String ile)
    Book class'ını kapsülleyin. (Encapsulate)
    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

todo  "Book name is BOOKNAME and Author is AUTHORNAME"
 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir kitap ismi giriniz : ");
        String kitap1 = scan.nextLine();
        System.out.print("bir kitap ismi adaha  giriniz : ");

        String kitap2 = scan.nextLine();


//BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ ve Book class'ında setter'ı ayarlarken bu variable'ları kullanınız.

        Book kitap = new Book();
        kitap.setAuthorName(kitap2);
        kitap.setBookName(kitap1);


        System.out.println("1. kitabım : " + kitap.getBookName() + " ve  2. kitabım : " + kitap.getAuthorName());


    }
}

