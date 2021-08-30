package _14_Override._02;

public class Main {

	public static void main(String[] args) {
		
		Hayvan hayvan =new Hayvan ("Tekir",30,5,"Kedi");
		System.out.println(hayvan.getIsim());
		System.out.println(hayvan.getAgirlik());
		System.out.println(hayvan.getUzunluk());
		System.out.println(hayvan.getCins());
		
		hayvan.beslenme();
		hayvan.solunum();
		hayvan.kos();
		
		Bitki bitki = new Bitki("Gul",2,1,"Kirmizi");
		
		System.out.println(bitki.getIsim());
		System.out.println(bitki.getAgirlik());
		System.out.println(bitki.getUzunluk());
		System.out.println(bitki.getRenk());
		
		bitki.beslenme();
		bitki.solunum();

	}

}
