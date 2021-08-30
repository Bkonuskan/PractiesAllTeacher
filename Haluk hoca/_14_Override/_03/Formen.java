package _14_Override._03;

public class Formen extends Isci {
	
	public String sorumluOldBolum ="bakim";
	public String isim= "Emrullah";
	

	public static void main(String[] args) {

		// Inhertance da data turu olarak class ismi kullanimi
		
		// bir class da obje �retirken data t�r� olarak class �n kendisini veya parent lar�n�  kullanabiiliriz
		// olusturdugumuz obje ile variable kullanmam�z gerekirs hangi degeri alacag�n� anlamak i�in 
		//�nce data t�r� olan class a gideriz orada arad�g�m�z variable varsa kullan�r�z, 
		// yoksa parent lar�na bakar�z yukar� dogru gidereken ilk buldugumuz degeri kullan�r�z
		
		Formen fr1= new Formen ();
		// fr1 objesini kullanarak hangi class lar�n variable lar� g�rebilirim
		fr1.sorumluOldBolum= "Marangozhane";
		fr1.maas= 100000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum+" "+ fr1.maas); //Emrullah Marangozhane 100000
		
		Isci fr2 = new Formen();
		//Data t�r� olarak Isci secildigi i�in
		fr2.bolum= "Kaynak atolyesi";
		//fr2.isim= "Yakup";
		//System.out.println(fr2.isim + " " + fr2.bolum+" "+ fr2.maas); //Yakup Kaynak atolyesi 5000
		// bu atamay� kald�r�p class da isim atad�ktan sonra 
		System.out.println(fr2.isim + " " + fr2.bolum+" "+ fr2.maas);  //Mesut Kaynak atolyesi 5000
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim); //Emre
		

	}

}
