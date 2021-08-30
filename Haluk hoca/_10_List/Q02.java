package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

	public static void main(String[] args) {
//		2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
//		listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
//		Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
//		   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

		String isim[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
/*
"Ali", "Veli", "Ayse"  -->0. kat
"Hasan", "Can"        -->1.kat
"Suzan"               -->.kat

 */
		yeniList(isim);
	}

	public static void yeniList(String str[][]) {
		List<String> list=new ArrayList<>();

		for (int kat = 0; kat < str.length; kat++) {//katlara giriş için kat kontrolu yapıldı
			for (int daire = 0; daire < str[kat].length; daire++) {//her kattaki daireye giriş için daire kontrolu yapıldı
				list.add(str[kat][daire]);//girdiğimiz her katın her dairesini list içine attık.

			}

		}System.out.println("sıralamada önceki list: "+list);
		Collections.sort(list);//list'i naturel order'e göre harf sırası yaptırdık.
		System.out.println("listin sıralanmış hali:"+list);
	}

}
