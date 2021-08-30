package _14_Override._02;

public class Canli {
	private String isim;
	private int uzunluk;
	private int agirlik;
	
	public Canli(String isim, int uzunluk, int agirlik) {
	
		this.isim = isim;
		this.uzunluk = uzunluk;
		this.agirlik = agirlik;
	}
	
	
	public void beslenme() {
		System.out.println("Beslenme methodu calisti.");
	}
	public void solunum() {
		System.out.println("Solumun methodu calisti.");
	}
	
	

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public int getAgirlik() {
		return agirlik;
	}

	public void setAgirlik(int agirlik) {
		this.agirlik = agirlik;
	}
	
	

}
