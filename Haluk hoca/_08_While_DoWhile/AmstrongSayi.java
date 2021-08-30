package _08_While_DoWhile;

import java.util.Scanner;

public class AmstrongSayi {

	public static void main(String[] args) {
        // kullanıcıdan alınan bir sayinin Armstrong sayi olup olmadigini kontrol eden program yazin
        // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
        

                
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen Armstrongo ldugunu kontrol edeceginiz tamsayiyi yaziniz : ");
        int sayi=scan.nextInt();        

        int kuplerToplami=0;
      int ilkDeger=sayi;  //ilk değer atanmazsa while içinde sayi sürekli değistiğinden sayı ilk değeri korunmaz.
        int rakam;
        
        while(sayi != 0) {
            rakam=sayi%10;
            sayi/=10;
            kuplerToplami+=rakam*rakam*rakam;
        }
        
        if (kuplerToplami==ilkDeger) {
            System.out.println("Gayet başarılı :) Girdiginiz sayi bir Armstrong sayidir ");
        } else System.out.println("Başarısız :( Girdiginiz sayi bir Armstrong sayi degildir ");
        
        scan.close();
	}

}
