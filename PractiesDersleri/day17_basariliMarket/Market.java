package day17_basariliMarket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Market {
	
	
	/* Basrili Market alış-veriş programı.
	 *{d,p,...l} {2.10,3.20....0.50}
	 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
	 * 			No 	   Ürün 		  Fiyat
			   ====	 =======	 	=========
				00	 Domates   	 	 2.10 TL
				01	 Patates   	 	 3.20 TL
				02	 Biber     	 	 1.50 TL
				03	 Soğan      	 2.30 TL
				04	 Havuç     	   	 3.10 TL
				05	 Elma      	   	 1.20 TL
				06	 Muz     	 	 1.90 TL
				07	 Çilek 	 		 6.10 TL
				08	 Kavun      	 4.30 TL
				09	 Üzüm      	 	 2.70 TL
				10	 Limon     	 	 0.50 TL
​
	 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
	 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
	 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
	 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
	 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
	 * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödeme sonrasında programı bitiriniz
	 */
	
	public static List<String> urunler=new ArrayList();
    public static List<Double> fiyatlar=new ArrayList();
    public static List<String>sepettekiUrunler=new ArrayList();
    public static List<Double>sepettekiFiyat=new ArrayList();
    public static List<Double>sepettekiKilo=new ArrayList();
    
 	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		urunler.addAll(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç","Elma","Muz","Cilek","Kavun","Uzum","Limon"));
		fiyatlar.addAll(Arrays.asList(2.1,3.2,1.5,2.3,3.1,1.2,1.9,6.1,4.3,2.7,0.5));
		int urunNo;
		double kg=0;
		String devam;
		double toplam=0;
		
		
		do {
		urunleriListele();
		System.out.println("Almak istediğiniz urunun numarasını girin");
		urunNo=scan.nextInt();
		System.out.println("kaç kilo almak istiyorsunuz");
		kg=scan.nextDouble();
		sepeteEkle(urunNo,kg);
		toplam=sepetiYazdır();
		System.out.println();
		System.out.println("devam etmek istiyor musunuz(E/H)");
		devam=scan.next();
		}while (devam.equalsIgnoreCase("E"));
		
		odemeYap(toplam);
		
		
		
		
 	}
 
 	public static void odemeYap(double toplam) {
		Scanner scan=new Scanner(System.in);
		System.out.println("-------------------------");
		double miktar=0;
		System.out.println("odemeniz gereken miktar= "+toplam);
		System.out.println("-------------------------");
		System.out.println("Ne kadar paranız var");
		miktar=scan.nextDouble();
		if (miktar<toplam) {
			System.out.println("Paranız yetersiz, ekleme yapın");
			System.out.println("ekleme yapacağınız miktar= "+(toplam-miktar));
		}
		while(miktar<=toplam);	
		System.out.println("-------------------------");
		System.out.println("Şu ana kadar" + miktar +" kadar ödeme yaptınız");
		System.out.println("Toplam Borcunuz" + toplam);
		System.out.println("-------------------------");
		
		System.out.println("Para üstünüz " + (miktar-toplam));
		System.out.println("Bizi Tercih ettiğiniz için TEŞEKKÜR ederiz");
	}
 
 	public static double sepetiYazdır() {
		double sepettekiToplam=0;
		System.out.println("URUNADI\tKILO\tTUTAR");
		System.out.println("------------------------------------------");
		for (int i=0;i<sepettekiUrunler.size();i++) {
			
			System.out.println(sepettekiUrunler.get(i)+"\t"+sepettekiKilo.get(i)+"\t"+sepettekiFiyat.get(i));
			sepettekiToplam+=sepettekiFiyat.get(i);
			
			
		}
		
		return sepettekiToplam;
		
		
	}
 	
 	public static void sepeteEkle(int urunNo, double kg) {
		
		sepettekiUrunler.add(urunler.get(urunNo));
		sepettekiKilo.add(kg);
		sepettekiFiyat.add(fiyatlar.get(urunNo)*kg);
		
		
	}

 	public static void urunleriListele() {	
		
		System.out.println("NO\tURUNLER\t\tFIYATLAR");
		System.out.println("-------------------------------------------------------------");
		
		for (int i=0; i<urunler.size(); i++) {
						
			System.out.println(i+"\t"+urunler.get(i)+"\t\t"+fiyatlar.get(i));
		}
		
	}

}