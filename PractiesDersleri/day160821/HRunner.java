package day160821;

public class HRunner {

	public static void main(String[] args) {
		/*
		
		-Hayvanların beslenme,barınma, boyut ve solunum özellikleri  ile ilgili methodlar barınıran Hayvan isminde bir class oluşturalım

		-Hayvan sınıfının SubClassı bir Kuş Classı oluşturalım ve bu class ucma ve barınma methodlarını içersin

		-Hayvan sınıfının SubClassı bir Balık Classı oluşturalım ve bu class yuzme ve Solunum methodlarını içersin

		-kuş sınıfının SubClassı bir Güvercin Classı oluşturalım ve bu class beslenme ve boyut methodlarını içersin

		-Balık sınıfının SubCLassı bir JaponBaligi classı oluşturalım ve bu class solunum methodu içersin ve bu methodu Superclasstan alsın

		--Runner class oluşturalım ve oluşturduğumuz methoları çağıralım.
		*/
		Hayvan h = new Hayvan();
		Kus k = new Kus();
		Guvercin g = new Guvercin();
		Balik b = new Balik();
		JaponBaligi j = new JaponBaligi();
		
		h.barinma();
		h.beslenme();
		h.boyut();
		h.solunum();
		
		k.ucma();
		k.barinma();
		
		g.beslenme();
		g.boyut();
		
		b.solunum();
		b.yuzme();
		
		j.solunum();
		
  
	}

	}


