package _14_Override._02;

public class Bitki extends Canli{
	private String renk;

	public Bitki(String isim, int uzunluk, int agirlik,String renk) {
		super(isim, uzunluk, agirlik);
		this.renk=renk;
		
	}
	public void solunum() {
		System.out.println("Bitki fotosentez yapar.");
	}

	@Override
	public void beslenme() {
		System.out.println("Bitki besleniyor.");
	}
	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

}
