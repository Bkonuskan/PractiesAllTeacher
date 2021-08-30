package KitapTakibi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KitapBilgileri {
	
	static List<Integer>kitapNo=new ArrayList();
	static List<String>kitapAdi=new ArrayList();
	static List<String>yazarAdi=new ArrayList();
	static List<Integer>kitapFiyati=new ArrayList();
	int sayac=1004;
	String cevap;
	
	static {
		kitapNo.addAll(Arrays.asList(1001,1002,1003));
		kitapAdi.addAll(Arrays.asList("Çalıkuşu","Sinekli Bakkal","şeker portakalı"));
		yazarAdi.addAll(Arrays.asList("Reşat Nuri Güntekin","Halide Edip Adıvar","Vasconcelos"));
		kitapFiyati.addAll(Arrays.asList(15,15,25));
	}
	
	public String kitapEkle() {
		String kitap;
		String yazar;
		int fiyat;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\n  KITAP EKLEME\n===================\n");
		do {
		System.out.println("kitap adı giriniz :");
		kitap=scan.nextLine();
		scan.nextLine();
		
		
		kitapAdi.add(kitap);
		System.out.println("kitap yazari giriniz :");
		yazar=scan.nextLine();
		yazarAdi.add(yazar);
		System.out.println("kitap fiyati giriniz :");
		fiyat=scan.nextInt();
		kitapFiyati.add(fiyat);
		kitapNo.add(sayac++);
		
		System.out.println("------------------------------------");
		System.out.println(sayac+"\t"+kitap+"\t"+yazar+"\t"+fiyat);
		System.out.println("------------------------------------");
		System.out.println("kitabınız başarılı bir şekilde eklenmiştir. Başka kitap eklemek ister misiniz: (E/H)");
		cevap=scan.next();
		}
		while (cevap.equalsIgnoreCase("e"));
		System.out.println("anamenu için bir tuşa basın");
		
		return scan.next();
	}

	
	public String noIleKitapGoruntule() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("-------------------------------------------------");
		do {
		System.out.println("goruntulemek istediğiniz kitabın numarasını giriniz");
		int no=scan.nextInt();
		System.out.println("-----------------------------------------------------");
		for (int i=0; i<kitapNo.size(); i++)
		{
			if (no==kitapNo.get(i)){
				System.out.println(kitapNo.get(i) +"\t"+ kitapAdi.get(i) +"\t"+ yazarAdi.get(i)+"\t"+kitapFiyati.get(i));
			}
		}
		System.out.println("Başka kitap goruntulemek ister misiniz(E/H)");
		cevap=scan.next();
	}
	while (cevap.equalsIgnoreCase("e"));
	System.out.println("anamenu için bir tuşa basın");
		
		return scan.next();
	}
	
	public String bilgiIleGoruntule() {
		Scanner scan=new Scanner(System.in);
		do {
			
		System.out.println("Hangi bilgi ile aramak istiyorsunuz");
		String bilgi=scan.nextLine();
		int flag=0;
		for (int i=0; i<kitapNo.size(); i++)
		{
			if (kitapAdi.get(i).contains(bilgi)||yazarAdi.get(i).contains(bilgi)) {
				System.out.println(kitapNo.get(i) +"\t"+ kitapAdi.get(i) +"\t"+ yazarAdi.get(i)+"\t"+kitapFiyati.get(i));
				flag=1;
			}
		}
		if (flag==1) {
			System.out.println("aradığınız bilgileri içeren kayıtlar listelendi");
		}else
		{
			System.out.println("arama kriterinize uygun kayıt bulunamadı");
		}
		
		System.out.println("başka arama yapmak istiyor musunz(E/H)");
		cevap=scan.next();
	}
	while (cevap.equalsIgnoreCase("e"));
	System.out.println("anamenu için bir tuşa basın");
		
		return scan.next();
	}
	
	
	public void kitapListele() {
		Scanner scan=new Scanner(System.in);
		System.out.println("KITAPNO\tKITAP ADI\t\tYAZAR ADI\t\tFIYAT");
		System.out.println("=========================================================");
		for (int i=0; i<kitapNo.size(); i++) {
			
			System.out.println(kitapNo.get(i) +"\t"+ kitapAdi.get(i) +"\t\t"+ yazarAdi.get(i)+"\t\t"+kitapFiyati.get(i));
		}
		
		
	}
	
	public String kitapSilme() {
		Scanner scan=new Scanner(System.in);
		do {
			
		int i=0;
		System.out.println("Silmek istediğiniz kitap no girin");
		int silinecekNo=scan.nextInt();
		for ( i=0;i<kitapNo.size();i++)
		{
			if (silinecekNo==kitapNo.get(i)) {
				break;
			}
		}
		kitapNo.remove(i);
		kitapAdi.remove(i);
		yazarAdi.remove(i);
		kitapFiyati.remove(i);
	
	
		System.out.println("silmek istediğiniz başka kitap var mı?(E/H)");
		cevap=scan.next();
	}
	while (cevap.equalsIgnoreCase("e"));
	System.out.println("anamenu için bir tuşa basın");
		
		return scan.next();
		
	}
	
}