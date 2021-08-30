package _12_Encapsulation._01_encapsulation;

public class E01 {

		/*
		 	1) Encapsulation kisaca "data hiding" demektir
		 	
		 	2) Basarili bir Encapsulation asagidaki ozelliklere sahip olmalidir.
		 		a)Nasil kullanilacagi belli olmalidir.(Direksiyon gibi)
		 		b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
		     	karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
		 		c)Bir bolumun bozulmasi diger bolumlerin bozulmasina sebep olmamalidir.
		 	
		 	3) Encapsulation nasil yapilir?
		 		a) Access modifier'lari private olarak kullaniniz.
		 		b) getter ve setter methodlari ile "encapsulated" datalara ulasip onlari okuyabilir(getter) ve
		 	      degistirebiliriz(setter)	.
		 	
		 	4) Encapsulation'in faydalari
		 		a) Esneklik(Flexibility). Normalde asagidaki ornekte age variable'inin degeri
		 	25'dir ama diger class'larda setAge() methodunu kullanarak age variable'inin
		 	degerini istedigimiz gibi degistirip kullanabiliriz.
		 		b) Reusability. getter ve setter method'lari bir kere olustururuz sonra proje icindeki
		 	tum classlar'dan istedigimiz kadar kullanabiliriz.
		 		c) Istediginiz data'yi okunabilir(getter() olustur), istediginiz data'yi okunamaz(getter() olusturma) 
		 	hale getirebilirsiniz
		 		d) Istediginiz data'yi degistirebilir (setter() olustur), istediginiz data'yi degistirilemez
		 	(setter() olusturma) yapabilirsiniz.	
		 	Not : Tum variable'lar private ve sadece getter() olusturulabilir. Bu tarz bir class'da
		 	data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.
		 	
		 	5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gostermez
		 	  Boylece kullanici yapmak istediklerini daha rahat yapar.
		 */
	
	 private int age = 25;
	 private String name = "Ali";
	// getter() olusturma
	 public int getAge() {
		 return age;
	 }
	 public String getName() {
		 return name;
	 }
	 
	 //setter() olusturmak
	 public	 void setAge(int age) {
		 this.age = age;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 
}
